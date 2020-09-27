/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import pe.com.weimont.cafeteriawmj_s3.service.EmpleadoService;

/**
 *
 * @author montespierreg
 */
public class Prueba10 {
    
    public static void main(String[] args) {
        try {
            EmpleadoService service = new EmpleadoService();
            service.registrarEmpleado("Mauro Icardi", "Vendedor", "986123456");
            System.out.println("Proceso ok");
        } catch (Exception e) {
        }
    }
}
