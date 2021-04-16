/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemDetVenta;

/**
 *
 * @author montespierreg
 */
public class Prueba33 {
    public static void main(String[] args) {
        int i;
        
        ItemDetVenta [] ventDet = {
            new ItemDetVenta(1, 1, 5, 10, 4, 40),
            new ItemDetVenta(2, 1, 6, 10, 5, 50),
            new ItemDetVenta(3, 1, 6, 10, 7, 70),
            new ItemDetVenta(4, 1, 6, 10, 3, 30),
            new ItemDetVenta(5, 1, 6, 10, 4, 40)
        };
        
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
