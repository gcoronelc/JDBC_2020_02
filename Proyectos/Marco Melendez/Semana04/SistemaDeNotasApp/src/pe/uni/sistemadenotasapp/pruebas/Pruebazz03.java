package pe.uni.sistemadenotasapp.pruebas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import pe.uni.sistemadenotasapp.db.AccesoDB;

public class Pruebazz03 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false);
			Statement stm = cn.createStatement();
			String sql = "insert into SistemaDeNotas.contador(conttabla,contitem,contlongitud) values( ?, ?, ? )";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, "nuevat9");
			pstm.setInt(2, 5);
			pstm.setInt(3, 6);
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
