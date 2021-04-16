package pe.uni.sistemadenotasapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.uni.sistemadenotasapp.db.AccesoDB;


public class CursoService {

    // Insertar profesor
    public void insertarCurso(String nombrecurso, String idprofesor) {
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
                + "where conttabla = 'curso'";
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
            sql = "update SistemaDeNotas.contador set contitem=? where conttabla = 'curso'";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, contitem);
            pstm.executeUpdate();
            pstm.close();

            // Insertar profesor
            sql = "insert into SistemaDeNotas.curso (idcurso, nombrecurso, idprofesor) "
                + "values (?,?,?)";
            pstm = cn.prepareStatement(sql);
			
			contador = "0000" + contitem;
			contador = contador.substring(contador.length()-4);
			
			pstm.setString(1, contador);
			pstm.setString(2, nombrecurso);
			pstm.setString(3, idprofesor);
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

    // Actualizar curso
    public void actualizarCurso(String idcurso, String nombrecurso, String idprofesor) {
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs = null;
        String sql;

        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            sql = "update SistemaDeNotas.curso set "
                + "nombrecurso=?, idprofesor=? where idcurso=?";

            pstm = cn.prepareStatement(sql);

            pstm.setString(1, nombrecurso);
            pstm.setString(2, idprofesor);
            pstm.setString(3, idcurso);

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

    // Eliminar curso
    public void eliminarCurso(String idcurso) {
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs = null;
        String sql;

        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            sql = "delete from SistemaDeNotas.curso "
                + "where idcurso=?";
            pstm = cn.prepareStatement(sql);
		
			pstm.setString(1, idcurso);
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
    
    
    public List<Map<String, ?>> listaCurso() {
		List<Map<String, ?>> lista = new ArrayList<>();
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select a.idcurso, a.nombrecurso, a.idprofesor, b.apellidos || ' ' || b.nombres as profesor "
				      + "from curso a, profesor b where a.idprofesor = b.idprofesor order by idcurso";
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
