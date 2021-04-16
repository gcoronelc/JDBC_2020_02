package pe.uni.sistemadenotasapp.controller;

import pe.uni.sistemadenotasapp.service.LogonService;
import pe.uni.sistemadenotasapp.util.Session;
import pe.uni.sistemadenotasapp.model.ProfesorModel;


public class LogonController {

	private final LogonService logonService;

	public LogonController() {
		logonService = new LogonService();
	}
	
	public void validar(String idprofesor, String clave){
		ProfesorModel model = logonService.validar(idprofesor, clave);
		Session.put("PROFESOR", model);
	}
	
}
