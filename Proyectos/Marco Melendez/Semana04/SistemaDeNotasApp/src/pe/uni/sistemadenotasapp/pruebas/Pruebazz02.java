package pe.uni.sistemadenotasapp.pruebas;

import java.sql.Connection;
import java.sql.Statement;
import pe.uni.sistemadenotasapp.db.AccesoDB;

public class Pruebazz02 {
	
   public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			Statement stm = cn.createStatement();
			cn.setAutoCommit(false); // Inicio de Tx
			stm.execute("insert into SistemaDeNotas.contador(conttabla,contitem,contlongitud) values( 'nuevat5', 1, 4 )");
			//stm.execute("insert into moneda(conttsbla,contitem,contlongitud) values( 'nuevat2', 1, 4 )");
			stm.close();
			cn.commit(); // Confirma la Tx
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			e.printStackTrace();
			try {
				cn.rollback(); // Cancela la Tx
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
