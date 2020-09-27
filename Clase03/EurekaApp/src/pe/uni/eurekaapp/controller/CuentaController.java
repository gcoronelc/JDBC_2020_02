package pe.uni.eurekaapp.controller;

import pe.uni.eurekaapp.service.CuentaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class CuentaController {

	private CuentaService cuentaService;

	public CuentaController() {
		cuentaService = new CuentaService();
	}
	
	public void registrarDeposito(String cuenta, double importe, String empleado){
		cuentaService.registrarDeposito(cuenta, importe, empleado);
	}
	
}
