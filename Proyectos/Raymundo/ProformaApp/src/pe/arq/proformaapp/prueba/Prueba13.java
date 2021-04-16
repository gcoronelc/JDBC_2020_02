/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.prueba;

import java.util.List;
import java.util.Map;
import pe.arq.proformaapp.service.ConsultaMaterialService;

/**
 *
 * @author WIN 7
 */
public class Prueba13 {

    public static void main(String[] args) {
        try {
            ConsultaMaterialService consultaMaterialService = new ConsultaMaterialService();
            List<Map<String,?>> lista = consultaMaterialService.getMovimientos("001");
            for(Map<String,?> r: lista){
                String cod = r.get("idMaterial").toString();
                String nro = r.get("nombre").toString();
                String uni = r.get("unidad").toString();
                System.out.println(cod + " - " + nro + " - " + uni);
            }
            System.out.println("Proceso ok");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    } 
}
