package pe.arq.proformaapp.prueba;

import pe.arq.proformaapp.model.EmpleadoModel;
import pe.arq.proformaapp.service.LogonService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba3 {
	
	public static void main(String[] args) {
		try {
			// Datos
			String user = "ray";
			String pass = "hola";
			// Proceso
			LogonService service = new LogonService();
			EmpleadoModel model = service.validar(user, pass);
			// Reporte
			System.out.println("Hola " + model.getNombre());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
