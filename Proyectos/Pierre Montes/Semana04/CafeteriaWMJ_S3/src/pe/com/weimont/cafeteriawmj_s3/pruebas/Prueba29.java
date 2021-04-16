/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import pe.com.weimont.cafeteriawmj_s3.db.AccesoDB;
import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemDetVenta;

/**
 *  private int idDet_Venta;
    private int idVenta;
    private int idArticulo;
    private int cant;
    private int precioUnit;
    private double importe;
 * @author montespierreg
 */
public class Prueba29 {
    public static void main(String[] args) {
        int i;
        
        ItemDetVenta [] ventDet = {
            new ItemDetVenta(1, 2, 2, 10, 4, 40),
            new ItemDetVenta(2, 2, 2, 10, 5, 50),
            new ItemDetVenta(3, 2, 3, 10, 7, 70),
            new ItemDetVenta(4, 2, 2, 10, 3, 30),
            new ItemDetVenta(5, 2, 2, 10, 4, 40)
        };
        
             
        //Insertar Detalle de Venta
        Connection cn = null;
    
        try {
            
            
            i = 0;
            while(i<ventDet.length){
                cn = AccesoDB.getConnection();  
                cn.setAutoCommit(false);
                //Statement stm = cn.createStatement();
            
                ///////
                String sql = "insert into det_venta(idDet_Venta, idVenta, idArticulo, cant, precioUnit, importe) values(?, ?, ?, ?, ?, ?)";
                PreparedStatement pstm = cn.prepareStatement(sql);
            
                pstm.setString(1, null);
                pstm.setString(2, Integer.toString(ventDet[i].getIdVenta()));
                pstm.setString(3, Integer.toString(ventDet[i].getIdArticulo()));
                pstm.setString(4, Integer.toString(ventDet[i].getCant()));
                pstm.setString(5, Integer.toString(ventDet[i].getPrecioUnit()));
                pstm.setString(6, Double.toString(ventDet[i].getImporte()));

                pstm.executeUpdate();
                cn.commit();
                
                System.out.println("Datos insertados");
                
                i = i + 1;
            }
        
        
            
            
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
