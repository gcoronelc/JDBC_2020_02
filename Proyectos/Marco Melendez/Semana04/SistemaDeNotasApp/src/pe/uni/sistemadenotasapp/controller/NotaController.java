package pe.uni.sistemadenotasapp.controller;

import java.util.List;
import java.util.Map;
import pe.uni.sistemadenotasapp.service.NotaService;
import pe.uni.sistemadenotasapp.service.ProfesorService;


public class NotaController {

	private final NotaService notaService;

	public NotaController() {
		notaService = new NotaService();
	}

	public void actualizarNota(String idnota, int nota1, int nota2, int examenfinal, int promedio){
		notaService.actualizarNota(idnota, nota1, nota2, examenfinal, promedio);
	}
    
    public List<Map<String,?>> listaNota(String idprofesor){
		return notaService.listaNota(idprofesor);
	} 
    
	
}