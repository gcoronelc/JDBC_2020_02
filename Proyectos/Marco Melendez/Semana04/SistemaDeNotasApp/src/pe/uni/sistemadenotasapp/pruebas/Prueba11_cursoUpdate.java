package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.service.CursoService;

public class Prueba11_cursoUpdate {
	
	public static void main(String[] args) {
		try {
			CursoService service = new CursoService();
			service.actualizarCurso("0013","ddddddd","0001");
			
            System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
