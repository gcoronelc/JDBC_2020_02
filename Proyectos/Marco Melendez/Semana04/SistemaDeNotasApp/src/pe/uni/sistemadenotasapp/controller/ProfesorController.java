package pe.uni.sistemadenotasapp.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import pe.uni.sistemadenotasapp.service.ProfesorService;


public class ProfesorController {

	private final ProfesorService profesorService;

	public ProfesorController() {
		profesorService = new ProfesorService();
	}
	
	public void insertarProfesor(String nombres, String apellidos, String dni, String direccion, String telefono, String email){
		profesorService.insertarProfesor(nombres, apellidos, dni, direccion, telefono, email);
	}
	
	public void actualizarProfesor(String idprofesor, String nombres, String apellidos, String dni, String direccion, String telefono, String email){
		profesorService.actualizarProfesor(idprofesor, nombres, apellidos, dni, direccion, telefono, email);
	}
    
    public void actualizaclaveProfesor(String clave){
        profesorService.actualizaclaveProfesor(clave);
    }
    
    public String esclaveProfesor(String clave) throws SQLException{
        return profesorService.esclaveProfesor(clave);
    }
    
    public void eliminarProfesor(String idprofesor){
		profesorService.eliminarProfesor(idprofesor);
	}
        
    public List<Map<String,?>> listaProfesor(){
		return profesorService.listaProfesor();
	} 
	
	
}