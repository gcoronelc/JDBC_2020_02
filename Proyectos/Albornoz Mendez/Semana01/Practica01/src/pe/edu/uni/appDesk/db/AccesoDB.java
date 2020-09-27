
package pe.edu.uni.appDesk.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {
    
    private AccesoDB() {
	}

    public static Connection getConnection() throws SQLException {
		Connection cn = null;
		// Parámetros
		String driver = "oracle.jdbc.OracleDriver";
		String urlDB = "jdbc:oracle:thin:@localhost:1521/XE";
		String user = "ventas";
		String pass = "ventas";
		try {
			Class.forName(driver).newInstance();
			cn = DriverManager.getConnection(urlDB, user, pass);
		} catch (SQLException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw new SQLException("No se encontro el driver de la BD.");
		} catch (Exception e) {
			throw new SQLException("No se puede establecer conexión de la BD.");
		}
		return cn;
	}
}
