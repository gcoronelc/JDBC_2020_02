package pe.uni.sistemadenotasapp.pruebas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.uni.sistemadenotasapp.db.AccesoDB;

public class Pruebazz05 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select * from SistemaDeNotas.profesor where upper(idprofesor) like ?";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, "000%");
			ResultSet rs = pstm.executeQuery();
			while( rs.next() ){
				String idprofesor = rs.getString("idprofesor");
				String nombres = rs.getString("nombres");
				System.out.println(idprofesor + " - " + nombres);
			}
			rs.close();
			pstm.close();
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		
	}

}
