/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import pe.com.weimont.cafeteriawmj_s3.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class EmpleadoService {
    /**
     * Registrar empleado
     * @param nomEmp Nombre del Empleado
     * @param puestoEmp Puesto del Empleado, puede ser vendedor, o allacenero
     * @param telEmp Telefono del empleado, debe ir el telefono
     */
    public void registrarEmpleado(String nomEmp, String puestoEmp, String telEmp){
        
        //Insertar Empleado - Modo Prepare Statement
        Connection cn = null;
        String sql;
    
        try {
            cn = AccesoDB.getConnection();  
            cn.setAutoCommit(false);
            //Datos de empleado
            sql = "insert into empleados(idEmpleado, nomEmp, puestoEmp, telEmp) values(?, ?, ?, ?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, null);
            pstm.setString(2, nomEmp);
            pstm.setString(3, puestoEmp);
            pstm.setString(4, telEmp);
            pstm.executeUpdate();
            
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
