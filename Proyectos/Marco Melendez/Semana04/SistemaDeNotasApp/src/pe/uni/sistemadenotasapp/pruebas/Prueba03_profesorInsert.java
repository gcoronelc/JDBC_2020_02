package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.service.ProfesorService;

public class Prueba03_profesorInsert {
	
	public static void main(String[] args) {
		try {
			ProfesorService service = new ProfesorService();
			service.insertarProfesor("Marco Antonio","Salazar Kizén","08151765","Av. Alameda del Corregidor 3025 dpto 201","964892158","marantsalhiz@gmail.com");
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
