package pe.uni.sistemadenotasapp.pruebas;

import java.sql.Connection;
import pe.uni.sistemadenotasapp.db.AccesoDB;

public class Prueba01_conexionBD {
	
	public static void main(String[] args) {
		try {
			Connection cn = AccesoDB.getConnection();
			System.out.println("conexión Ok");
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
