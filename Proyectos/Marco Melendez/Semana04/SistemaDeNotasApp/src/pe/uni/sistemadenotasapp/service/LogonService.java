package pe.uni.sistemadenotasapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.uni.sistemadenotasapp.db.AccesoDB;
import pe.uni.sistemadenotasapp.model.ProfesorModel;


public class LogonService {
	
	public ProfesorModel validar(String idprofesor, String clave){
		ProfesorModel model = null;
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select idprofesor, nombres, apellidos, dni, " +
					"direccion, telefono, email " +
					"from SistemaDeNotas.profesor " +
					"where idprofesor = ? and clave = ?";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, idprofesor);
			pstm.setString(2, clave);
			ResultSet rs = pstm.executeQuery();
			if( rs.next() ){
				model = new ProfesorModel();
				model.setIdprofesor(rs.getString("idprofesor"));
				model.setNombres(rs.getString("nombres"));
				model.setApellidos(rs.getString("apellidos"));
				model.setDni(rs.getString("dni"));
				model.setDireccion(rs.getString("direccion"));
				model.setTelefono(rs.getString("telefono"));
				model.setEmail(rs.getString("email"));
			}
			rs.close();
			pstm.close();
			if(model == null){
				throw new Exception("Datos incorrectos.");
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return model;
	}

}
