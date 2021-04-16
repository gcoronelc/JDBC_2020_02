/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author montespierreg
 */
public class AccesoDB {
    private AccesoDB(){
    }
    
    public static Connection getConnection() throws SQLException{
        Connection cn = null;
        try {
            //Parametros
            String url = "jdbc:mysql://localhost/weimont";
            String user = "root";
            String pass = "";
            cn = DriverManager.getConnection(url, user, pass);
            
            
            
        } catch (SQLException ex) {
            //Agarrar los errores
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return cn;
    }
}
