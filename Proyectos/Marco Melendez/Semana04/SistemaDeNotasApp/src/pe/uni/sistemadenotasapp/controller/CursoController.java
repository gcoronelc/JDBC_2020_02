package pe.uni.sistemadenotasapp.controller;

import java.util.List;
import java.util.Map;
import pe.uni.sistemadenotasapp.service.CursoService;


public class CursoController {

	private final CursoService cursoService;

	public CursoController() {
		cursoService = new CursoService();
	}
	
	public void insertarCurso(String cursonombre, String idprofesor){
		cursoService.insertarCurso(cursonombre, idprofesor);
	}
	
	public void actualizarCurso(String idcurso, String nombrecurso, String idprofesor){
		cursoService.actualizarCurso(idcurso, nombrecurso, idprofesor);
	}
    
    public void eliminarCurso(String idprofesor){
		cursoService.eliminarCurso(idprofesor);
	}
        
    public List<Map<String,?>> listaCurso(){
		return cursoService.listaCurso();
	} 
	
	
}