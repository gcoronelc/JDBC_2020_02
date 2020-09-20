package pe.egcc.eurekaapp2.prueba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import pe.egcc.eurekaapp2.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba03 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false);
			Statement stm = cn.createStatement();
			String sql = "insert into eureka.moneda(chr_monecodigo,vch_monedescripcion) values( ?, ? )";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, "66");
			pstm.setString(2, "MONEDA COOL");
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
