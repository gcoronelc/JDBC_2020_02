/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.model;

/**
 *
 * @author WIN 7
 */
public class EmpleadoModel {

    private String idEmpleado;
    private String nombre;
    private String apellido;
    private String dni;
    private String usuario;
    private String clave;

    public EmpleadoModel(){
    }
    
    public EmpleadoModel(String idEmpleado,String nombre,String apellido, String dni, String usuario , String clave){
        this.idEmpleado=idEmpleado;
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.usuario=usuario;
        this.clave=clave;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    

    
    
}
