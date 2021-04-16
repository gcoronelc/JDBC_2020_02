package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.service.ProfesorService;

public class Prueba04_profesorUpdate {
	
	public static void main(String[] args) {
		try {
			ProfesorService service = new ProfesorService();
			service.actualizarProfesor("0018","Maria","Figueroa Bustamante","08134543","Av. Circunvalacion 2533","964833333","mariafigueroa@hotmail.com");
			
            System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
