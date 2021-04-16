package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.service.CursoService;

public class Prueba12_cursoDelete {
	
	public static void main(String[] args) {
		try {
			CursoService service = new CursoService();
			service.eliminarCurso("0013");
			
            System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
