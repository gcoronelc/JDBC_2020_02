package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.service.AlumnoService;
import pe.uni.sistemadenotasapp.service.ProfesorService;

public class Prueba07_alumnoInsert {
	
	public static void main(String[] args) {
		try {
			AlumnoService service = new AlumnoService();
			service.insertarAlumno("Marco Antonio","Salazar Kizén","26/02/1973","1","A","Av. Alameda del Corregidor 3025 dpto 201","964892158","marantsalhiz@gmail.com","Tutor Del alumno","99887766","tutor@gmail.com");
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
