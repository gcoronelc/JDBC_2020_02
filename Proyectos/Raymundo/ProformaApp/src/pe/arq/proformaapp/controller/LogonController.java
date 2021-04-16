package pe.arq.proformaapp.controller;

import pe.arq.proformaapp.model.EmpleadoModel;
import pe.arq.proformaapp.service.LogonService;
import pe.arq.proformaapp.util.Session;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class LogonController {

	private LogonService logonService;

	public LogonController() {
		logonService = new LogonService();
	}
	
	public void validar(String user, String pass){
		EmpleadoModel model = logonService.validar(user, pass);
		Session.put("USUARIO", model);
	}
	
}
