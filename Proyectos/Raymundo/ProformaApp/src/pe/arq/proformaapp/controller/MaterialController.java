/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.controller;

import java.util.List;
import java.util.Map;
import pe.arq.proformaapp.service.ConsultaMaterialService;

/**
 *
 * @author WIN 7
 */
public class MaterialController {
    
    private ConsultaMaterialService consultaMaterialService;
    
    public MaterialController(){
        consultaMaterialService = new ConsultaMaterialService();
    }
    
    public List<Map<String, ?>> getMovimientos(String cuenta){
        return consultaMaterialService.getMovimientos(cuenta);
    }

    
}
