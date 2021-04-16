package pe.uni.sistemadenotasapp.pruebas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import pe.uni.sistemadenotasapp.db.AccesoDB;

public class Pruebazz04 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			Statement stm = cn.createStatement();
			String sql = "select * from SistemaDeNotas.profesor";
			ResultSet rs = stm.executeQuery(sql);
			while( rs.next() ){
				String idprofesor = rs.getString("idprofesor");
				String nombres = rs.getString("nombres");
				System.out.println(idprofesor + " - " + nombres);
			}
			rs.close();
			stm.close();
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
