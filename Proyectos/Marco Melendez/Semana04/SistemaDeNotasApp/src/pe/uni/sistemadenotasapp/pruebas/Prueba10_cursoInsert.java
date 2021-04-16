package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.service.CursoService;

public class Prueba10_cursoInsert {
	
	public static void main(String[] args) {
		try {
			CursoService service = new CursoService();
			service.insertarCurso("aaaasss","0001");
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
