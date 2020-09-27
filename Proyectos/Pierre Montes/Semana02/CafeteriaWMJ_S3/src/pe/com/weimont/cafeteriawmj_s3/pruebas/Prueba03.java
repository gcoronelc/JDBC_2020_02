/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import pe.com.weimont.cafeteriawmj_s3.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class Prueba03 {
    public static void main(String[] args) {
        //Insertar Empleado - Modo Prepare Statement
        Connection cn = null;
    
        try {
            cn = AccesoDB.getConnection();  
            cn.setAutoCommit(false);
            //Statement stm = cn.createStatement();
            
            String sql = "insert into empleados(idEmpleado, nomEmp, puestoEmp, telEmp) values(?, ?, ?, ?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, null);
            pstm.setString(2, "Johan Fano");
            pstm.setString(3, "vendedor");
            pstm.setString(4, "111456345");
            pstm.executeUpdate();
            //stm.close();
            cn.commit();
            System.out.println("Datos insertados");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }
}
