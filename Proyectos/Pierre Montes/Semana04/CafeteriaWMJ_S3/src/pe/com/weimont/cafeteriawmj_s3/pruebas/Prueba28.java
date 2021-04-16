/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemConsVenta;

/**
 *
 * @author montespierreg
 */
public class Prueba28 {
    public static void main(String[] args) {
        
        int i;
        
        ItemConsVenta ventaCons = new ItemConsVenta(1, 3, 6,6, 10, 15.50, 1.5, 17);
        
        System.out.println(ventaCons.getIdVenta());
        System.out.println(ventaCons.getIdEmpleado());
        
        
        
    }
}
