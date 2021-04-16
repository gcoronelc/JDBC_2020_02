package pe.uni.sistemadenotasapp.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.uni.sistemadenotasapp.db.AccesoDB;


public class AlumnoService {

    // Insertar alumno
    public void insertarAlumno(String nombres, String apellidos, String fechanacimiento, String grado, String seccion, String direccion, String telefono, String email, String nombretutor, String telefonotutor, String emailtutor) {
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
                + "where conttabla = 'alumno'";
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
            sql = "update SistemaDeNotas.contador set contitem=? where conttabla = 'alumno'";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, contitem);
            pstm.executeUpdate();
            pstm.close();

            // Insertar profesor
            sql = "insert into SistemaDeNotas.alumno (idalumno, nombres, apellidos, "
                + "fechanacimiento, grado, seccion, direccion, telefono, email, "
                + "nombretutor, telefonotutor, emailtutor, clave) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,'1111')";
            pstm = cn.prepareStatement(sql);
			
			contador = "0000" + contitem;
			contador = contador.substring(contador.length()-4);
			
			pstm.setString(1, contador);
			pstm.setString(2, nombres);
			pstm.setString(3, apellidos);
			pstm.setString(4, fechanacimiento);
			pstm.setString(5, grado);
			pstm.setString(6, seccion);
			pstm.setString(7, direccion);
			pstm.setString(8, telefono);
			pstm.setString(9, email);
			pstm.setString(10, nombretutor);
			pstm.setString(11, telefonotutor);
			pstm.setString(12, emailtutor);

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

    // Actualizar alumno
    public void actualizarAlumno(String idalumno, String nombres, String apellidos, String fechanacimiento, String grado, String seccion, String direccion, String telefono, String email, String nombretutor, String telefonotutor, String emailtutor) {
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs = null;
        String sql;

        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            sql = "update SistemaDeNotas.alumno set "
                + "nombres=?, apellidos=?, "
                + "fechanacimiento=?, grado=?, seccion=?, direccion=?, telefono=?, email=?, "
                + "nombretutor=?, telefonotutor=?, emailtutor=? "
                + "where idalumno=?";

            pstm = cn.prepareStatement(sql);

			pstm.setString(1, nombres);
			pstm.setString(2, apellidos);
			pstm.setString(3, fechanacimiento);
			pstm.setString(4, grado);
			pstm.setString(5, seccion);
			pstm.setString(6, direccion);
			pstm.setString(7, telefono);
			pstm.setString(8, email);
			pstm.setString(9, nombretutor);
			pstm.setString(10, telefonotutor);
			pstm.setString(11, emailtutor);
			pstm.setString(12, idalumno);

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


    // Eliminar alumno
    public void eliminarAlumno(String idalumno) {
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs = null;
        String sql;

        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            sql = "delete from SistemaDeNotas.alumno "
                + "where idalumno=?";
            pstm = cn.prepareStatement(sql);
		
			pstm.setString(1, idalumno);
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
    
    
    public List<Map<String, ?>> listaAlumno() {
		List<Map<String, ?>> lista = new ArrayList<>();
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select idalumno, nombres, apellidos, "
				      + "fechanacimiento, grado, seccion, direccion, telefono, email, "
				      + "nombretutor, telefonotutor, emailtutor from alumno order by idalumno ";
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

    /**
     *
     * @param fecha
     * @return
     */
    public Date aFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = (Date) formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }    
    
    
    
    
    
    
}
