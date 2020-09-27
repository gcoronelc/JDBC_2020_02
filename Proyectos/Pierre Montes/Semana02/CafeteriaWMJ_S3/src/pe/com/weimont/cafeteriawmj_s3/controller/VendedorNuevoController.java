/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.controller;

import pe.com.weimont.cafeteriawmj_s3.service.EmpleadoService;

/**
 *
 * @author montespierreg
 */
public class VendedorNuevoController {
    private EmpleadoService empleadoService;
    
    public VendedorNuevoController(){
        empleadoService = new EmpleadoService();
    }
    
    public void registrarEmpleado(String nomEmp, String puestoEmp, String telEmp){
        empleadoService.registrarEmpleado(nomEmp, puestoEmp, telEmp);
    }
}
