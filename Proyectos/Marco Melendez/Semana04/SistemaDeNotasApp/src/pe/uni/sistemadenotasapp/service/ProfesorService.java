package pe.uni.sistemadenotasapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.uni.sistemadenotasapp.db.AccesoDB;
import pe.uni.sistemadenotasapp.model.ProfesorModel;
import pe.uni.sistemadenotasapp.util.Session;
import pe.uni.sistemadenotasapp.service.LogonService;



public class ProfesorService {

    // Insertar profesor
    public void insertarProfesor(String nombres, String apellidos, String dni, String direccion, String telefono, String email) {
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs = null;
        String sql, contador;
        int contitem = 0;
        int contlongitud = 0;

        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            // Obtener contador
            sql = "select contitem, contlongitud from SistemaDeNotas.contador "
                + "where conttabla = 'profesor'";
            pstm = cn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (!rs.next()) {
                throw new Exception("Consecutivo no existe.");
            }

            contitem = rs.getInt("contitem");
            contlongitud = rs.getInt("contlongitud");
            rs.close();
            pstm.close();

            // Actualizar contador
            contitem++;
            sql = "update SistemaDeNotas.contador set contitem=? where conttabla = 'profesor'";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, contitem);
            pstm.executeUpdate();
            pstm.close();

            // Insertar profesor
            sql = "insert into SistemaDeNotas.profesor (idprofesor, nombres, apellidos, "
                + "dni, direccion, telefono, email, clave) "
                + "values (?,?,?,?,?,?,?,'1111')";
            pstm = cn.prepareStatement(sql);
			
			contador = "0000" + contitem;
			contador = contador.substring(contador.length()-4);
			
			pstm.setString(1, contador);
			pstm.setString(2, nombres);
			pstm.setString(3, apellidos);
			pstm.setString(4, dni);
			pstm.setString(5, direccion);
			pstm.setString(6, telefono);
			pstm.setString(7, email);
			pstm.executeUpdate();
			pstm.close();

            cn.commit();

        } catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Error en el proceso. " + e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}

	}

    // Actualizar profesor
    public void actualizarProfesor(String idprofesor, String nombres, String apellidos, String dni, String direccion, String telefono, String email) {
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs = null;
        String sql;

        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            sql = "update SistemaDeNotas.profesor set "
                + "nombres=?, apellidos=?, dni=?, direccion=?, telefono=?, email=? "
                + "where idprofesor=?";

            pstm = cn.prepareStatement(sql);

            pstm.setString(1, nombres);
            pstm.setString(2, apellidos);
            pstm.setString(3, dni);
            pstm.setString(4, direccion);
            pstm.setString(5, telefono);
            pstm.setString(6, email);
            pstm.setString(7, idprofesor);

            pstm.executeUpdate();
			pstm.close();

            cn.commit();

        } catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Error en el proceso. " + e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}

	}

    // Actualizar clave del profesor
    public String esclaveProfesor(String clave) throws SQLException {
        
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs = null;
        String sql, idprofesor, resul;

        ProfesorModel model = (ProfesorModel) Session.get("PROFESOR");
        idprofesor = model.getIdprofesor();

        cn = AccesoDB.getConnection();
        cn.setAutoCommit(false);

        sql = "select idprofesor from profesor where idprofesor=? and clave=?";
        pstm = cn.prepareStatement(sql);
        pstm.setString(1, idprofesor);
        pstm.setString(2, clave);
        rs = pstm.executeQuery();
        if (!rs.next()) {
            resul = "NO";
        }else{
            resul = "SI";
        }
        rs.close();
        pstm.close();
        return resul;
	}

    // Actualizar clave del profesor
    public void actualizaclaveProfesor(String clave) {
        
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs = null;
        String sql, idprofesor, resul;

        ProfesorModel model = (ProfesorModel) Session.get("PROFESOR");
        idprofesor = model.getIdprofesor();

        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            sql = "update profesor set clave=? where idprofesor=?";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, clave);
            pstm.setString(2, idprofesor);
            pstm.executeUpdate();
            pstm.close();
            cn.commit();

        } catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Error en el proceso. " + e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}

	}

    // Eliminar profesor
    public void eliminarProfesor(String idprofesor) {
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs = null;
        String sql;

        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            sql = "delete from SistemaDeNotas.profesor "
                + "where idprofesor=?";
            pstm = cn.prepareStatement(sql);
		
			pstm.setString(1, idprofesor);
			pstm.executeUpdate();
			pstm.close();

            cn.commit();

        } catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Error en el proceso. " + e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}

	}
    
    
    public List<Map<String, ?>> listaProfesor() {
		List<Map<String, ?>> lista = new ArrayList<>();
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select idprofesor, nombres, apellidos, "
				      + "dni, direccion, telefono, email, clave "
				      + "from profesor order by idprofesor";
			PreparedStatement pstm = cn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			lista = JdbcUtil.rsToList(rs);
			rs.close();
			pstm.close();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return lista;
	}

}
