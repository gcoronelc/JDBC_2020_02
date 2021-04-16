package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.service.ProfesorService;

public class Prueba05_profesorDelete {
	
	public static void main(String[] args) {
		try {
			ProfesorService service = new ProfesorService();
			service.eliminarProfesor("0021");
			
            System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
