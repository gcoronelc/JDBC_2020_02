package pe.uni.sistemadenotasapp.pruebas;

import pe.uni.sistemadenotasapp.model.ProfesorModel;
import pe.uni.sistemadenotasapp.service.LogonService;
import pe.uni.sistemadenotasapp.service.ProfesorService;

public class Prueba02_logonValidar {
	
    public static void main(String[] args) {
		try {
			// Datos
			String idprofesor = "0001";
			String clave = "1111";
			// Proceso
			LogonService service = new LogonService();
			ProfesorModel model = service.validar(idprofesor, clave);
			// Reporte
			System.out.println("Hola " + model.getIdprofesor());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

    
    
}
