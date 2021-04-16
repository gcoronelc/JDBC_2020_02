/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import pe.com.weimont.cafeteriawmj_s3.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class Prueba42 {
    public static void main(String[] args) {
        //Select - Usando ResultSet
        Connection cn = null;
        
        try {
            cn = AccesoDB.getConnection();  
            cn.setAutoCommit(false);
            Statement stm = cn.createStatement();
            String sql = "select count(*) from ventas";
            //SELECT COUNT(*) FROM `ventas` 
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                int count = rs.getInt("count(*)");
                
                System.out.println(count);
            }
            
            rs.close();
            stm.close();
            System.out.println("ok");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }
}
