package pe.uni.sistemadenotasapp.controller;

import java.util.List;
import java.util.Map;
import pe.uni.sistemadenotasapp.service.AlumnoService;

public class AlumnoController {

	private final AlumnoService alumnoService;

	public AlumnoController() {
		alumnoService = new AlumnoService();
	}
	
	public void insertarAlumno(String nombres, String apellidos, String fechanacimiento, String grado, String seccion, String direccion, String telefono, String email, String nombretutor, String telefonotutor, String emailtutor){
		alumnoService.insertarAlumno(nombres, apellidos, fechanacimiento, grado, seccion, direccion, telefono, email, nombretutor, telefonotutor, emailtutor);
	}
	
	public void actualizarAlumno(String idalumno, String nombres, String apellidos, String fechanacimiento, String grado, String seccion, String direccion, String telefono, String email, String nombretutor, String telefonotutor, String emailtutor){
		alumnoService.actualizarAlumno(idalumno, nombres, apellidos, fechanacimiento, grado, seccion, direccion, telefono, email, nombretutor, telefonotutor, emailtutor);
	}
    
   
    public void eliminarAlumno(String idalumno){
		alumnoService.eliminarAlumno(idalumno);
	}
        
    public List<Map<String,?>> listaAlumno(){
		return alumnoService.listaAlumno();
	} 
	
	
}