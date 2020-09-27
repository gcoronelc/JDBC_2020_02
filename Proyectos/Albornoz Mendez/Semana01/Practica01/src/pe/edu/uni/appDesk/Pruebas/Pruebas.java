
package pe.edu.uni.appDesk.Pruebas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import pe.edu.uni.appDesk.db.AccesoDB;

public class Pruebas {
    public static void main(String[] args) {
        Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false);
			Statement stm = cn.createStatement();
			String sql = "insert into Clientes(CLIENTEID,NOMBRES,APELLIDOS,EMAIL,CELULAR) values( ?, ?, ?, ?, ? )";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, "75249280");
			pstm.setString(2, "Williams");
                        pstm.setString(3, "Albornoz Mendez");
                        pstm.setString(4, "wham@gmail.com");
                        pstm.setString(5, "977673813");
			pstm.executeUpdate();
			stm.close();
			cn.commit();
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			e.printStackTrace();
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
    }
}
