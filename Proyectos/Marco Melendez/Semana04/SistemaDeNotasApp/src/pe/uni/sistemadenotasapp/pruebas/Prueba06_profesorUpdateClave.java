package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.service.ProfesorService;

public class Prueba06_profesorUpdateClave {
	
	public static void main(String[] args) {
		try {
			ProfesorService service = new ProfesorService();
			service.actualizarclaveProfesor("0002", "1111");
			
            System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
