/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.accesodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author WIN 7
 */
public class AccesoSql {
    
    private AccesoSql() {
	}

	public static Connection getConnection() throws SQLException {
            Connection cn = null;
            // Parámetros
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String urlDB = "jdbc:sqlserver://localhost:1433;databaseName=dbProformaJava";
            String user = "server";
            String pass = "proforma";
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