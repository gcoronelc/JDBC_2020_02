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
public class Prueba10b {
    public static void main(String[] args) {
        //Select - Usando ResultSet
        Connection cn = null;
        
        try {
            cn = AccesoDB.getConnection();  
            cn.setAutoCommit(false);
            Statement stm = cn.createStatement();
            String sql = "select idEmpleado, nomEmp, puestoEmp, telEmp from empleados";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                String codigo = rs.getString("idEmpleado");
                String nombre = rs.getString("nomEmp");
                String puesto = rs.getString("puestoEmp");
                String telefono = rs.getString("telEmp");
                System.out.println(codigo + " - " + nombre + " - " + puesto + " - " + telefono);
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
