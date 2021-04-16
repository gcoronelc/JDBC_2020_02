package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.service.AlumnoService;
import pe.uni.sistemadenotasapp.service.ProfesorService;

public class Prueba08_alumnoUpdate {
	
	public static void main(String[] args) {
		try {
			AlumnoService service = new AlumnoService();
			service.actualizarAlumno("0016","AAAA Anthoni","Salazar Hizén","26/02/1983","2","B","Av. Pizarro 787 dpto 7","99992158","marant@gmail.com","Mary salazar","994446","tuto333r@gmail.com");
			
            System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
