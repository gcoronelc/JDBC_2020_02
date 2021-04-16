package pe.uni.sistemadenotasapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.uni.sistemadenotasapp.db.AccesoDB;


public class NotaService {

    // Actualizar profesor
    public void actualizarNota(String idnota, int nota1, int nota2, int  examenfinal, int promedio) {
        Connection cn = null;
        PreparedStatement pstm;
        ResultSet rs = null;
        String sql = "";

        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            // Actualiza profesor
            sql = "update SistemaDeNotas.nota set "
                + "nota1=?, nota2=?, examenfinal=?, promedio=? "
                + "where idnota=?";
            pstm = cn.prepareStatement(sql);

            pstm.setInt(1, nota1);
			pstm.setInt(2, nota2);
			pstm.setInt(3, examenfinal);
			pstm.setInt(4, promedio);
			pstm.setString(5, idnota);
            
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

    public List<Map<String, ?>> listaNota(String idprofesor) {
		List<Map<String, ?>> lista = new ArrayList<>();
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql =    "select " + 
                            "a.idcurso,c.nombrecurso,  " + 
                            "b.idalumno,b.apellidos,b.nombres, " + 
                            "a.idnota,a.nota1,a.nota2,a.examenfinal,a.promedio " + 
                            "from nota a, alumno b, curso c " + 
                            "where a.idcurso = c.idcurso " + 
                            "and   a.idalumno = b.idalumno " + 
                            "and   c.idprofesor = ?  " + 
                            "order by a.idcurso, b.idalumno";
			PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, idprofesor);
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
