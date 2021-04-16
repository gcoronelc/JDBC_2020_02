package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.service.AlumnoService;
import pe.uni.sistemadenotasapp.service.ProfesorService;

public class Prueba09_alumnoDelete {
	
	public static void main(String[] args) {
		try {
			AlumnoService service = new AlumnoService();
			service.eliminarAlumno("0018");
			
            System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
