/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.entidad;

/**
 *
 * @author WIN 7
 */
public class EMaterial {

    private String nombre;
    private String unidad;
    
    public EMaterial(){
    }

    public EMaterial(String _nombre, String _unidad) {
        nombre = _nombre;
        unidad = _unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidad() {
        return unidad;
    }
    
    public void VerInformacion() {
        System.out.println(nombre + " " + unidad);
    }
}
