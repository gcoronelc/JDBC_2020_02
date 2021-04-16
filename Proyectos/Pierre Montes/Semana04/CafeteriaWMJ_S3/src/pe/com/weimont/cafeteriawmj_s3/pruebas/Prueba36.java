/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;
import pe.com.weimont.cafeteriawmj_s3.db.AccesoDB;
import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemConsVenta;
import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemDetVenta;

/**
 * Detallado de venta
 *  private int idDet_Venta;
    private int idVenta;
    private int idArticulo;
    private int cant;
    private int precioUnit;
    private double importe;
    * 
 * Consolidado de venta
 *  idVenta
 *  idEmpleado
 *  fechaVenta
 *  horaVenta	
 *  unidTotales	
 *  subTotal	
 *  igv	
 *  imporTotal
 * @author montespierreg
 */
public class Prueba36 {
    public static void main(String[] args) {
        int i;
        long today2 = Calendar.getInstance().getTimeInMillis();
        
        ItemConsVenta ventaCons = new ItemConsVenta(3, 2, today2,today2, 10, 15.5, 1.5, 17.5);
        
        System.out.println(ventaCons.getIdVenta());
        System.out.println(ventaCons.getIdEmpleado());//
        System.out.println(ventaCons.getFechaVenta());//
        System.out.println(ventaCons.getHoraVenta());//
        System.out.println(ventaCons.getUnidTotales());//
        System.out.println(ventaCons.getSubTotal());
        System.out.println(ventaCons.getIgv());
        System.out.println(ventaCons.getImporTotal());
        
             
        //Insertar Consolidado de Venta
        Connection cn = null;
    
        try {
            
            
                cn = AccesoDB.getConnection();  
                cn.setAutoCommit(false);
                //Statement stm = cn.createStatement();
            
                ///////
                String sql = "insert into ventas(idVenta, idEmpleado, fechaVenta, " +
                            "horaVenta, unidTotales, subTotal, igv, imporTotal) "
                        + "values(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstm = cn.prepareStatement(sql);
            
                pstm.setString(1, null);
                pstm.setString(2, Integer.toString(ventaCons.getIdEmpleado()));
                pstm.setString(3, Long.toString(ventaCons.getFechaVenta()));
                pstm.setString(4, Long.toString(ventaCons.getHoraVenta()));
                pstm.setString(5, Integer.toString(ventaCons.getUnidTotales()));
                pstm.setString(6, Double.toString(ventaCons.getSubTotal()));
                pstm.setString(7, Double.toString(ventaCons.getIgv()));
                pstm.setString(8, Double.toString(ventaCons.getImporTotal()));

                pstm.executeUpdate();
                cn.commit();
                
                System.out.println("Datos insertados");
                
                
        
            
            
            //////////
            
            
            
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
