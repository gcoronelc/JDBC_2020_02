/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import java.util.Calendar;
import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemConsVenta;
import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemDetVenta;


/**
 ****************
 * Detallado de venta
 *  private int idDet_Venta;
    private int idVenta;
    private int idArticulo;
    private int cant;
    private int precioUnit;
    private double importe;
 * 
 * Venta
 *  private int idVenta;
    private int idEmpleado;
    private long fechaVenta;
    private long horaVenta;
    private int unidTotales;
    private double subTotal;
    private double igv;
    private double imporTotal;
 * @author montespierreg
 */
public class Prueba34 {
    public static void main(String[] args) {
        int i;
        long today2 = Calendar.getInstance().getTimeInMillis();
        
        ItemDetVenta [] ventDet = {
            new ItemDetVenta(1, 3, 5, 10, 4, 40),
            new ItemDetVenta(2, 3, 6, 10, 5, 50),
            new ItemDetVenta(3, 3, 6, 10, 7, 70),
            new ItemDetVenta(4, 3, 6, 10, 3, 30),
            new ItemDetVenta(5, 3, 6, 10, 4, 40)
        };
        
        
        
        
        ItemConsVenta ventaCons = new ItemConsVenta(3, 2,today2, today2, 
                ventDet[4].getCant(), ventDet[4].getImporte(), 
                ventDet[4].getImporte()*0.18, ventDet[4].getImporte()*1.18);
        
        i = 0;
        while(i<ventDet.length){
            System.out.print(ventDet[i].getIdDet_Venta());
            System.out.println("-");
            System.out.print(ventDet[i].getIdVenta());
            System.out.println("-");
            System.out.print(ventDet[i].getImporte());
            System.out.println("\n");
            i = i + 1;
        }
    }
}
