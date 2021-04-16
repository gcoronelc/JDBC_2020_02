/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.prueba;

import pe.arq.proformaapp.entidad.EMaterial;

/**
 *
 * @author WIN 7
 */
public class Prueba04 {
    public static void main(String[] args) {
        EMaterial m1 = new EMaterial("Clavo","Kilo");
        
        System.out.println(m1.getNombre() +  m1.getUnidad());
        
    }
    
}
