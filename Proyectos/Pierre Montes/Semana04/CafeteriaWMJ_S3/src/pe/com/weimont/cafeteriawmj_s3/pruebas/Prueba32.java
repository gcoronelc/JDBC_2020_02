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
 * idDet_Venta es autoincrement
 * idVenta
 * idArticulo
 * cant
 * precioUnit
 * importe
 * @author montespierreg
 */
public class Prueba32 {
    public static void main(String[] args) {
        //Insertar Detalle de Venta
        Connection cn = null;
    
        try {
            cn = AccesoDB.getConnection();  
            cn.setAutoCommit(false);
            //Statement stm = cn.createStatement();
            
            String sql = "insert into det_venta(idDet_Venta, idVenta, idArticulo, cant, precioUnit, importe) values(?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, null);
            pstm.setString(2, "2");
            pstm.setString(3, "1");
            pstm.setString(4, "10");
            pstm.setString(5, "4.0");
            pstm.setString(6, "40.0");
            
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
