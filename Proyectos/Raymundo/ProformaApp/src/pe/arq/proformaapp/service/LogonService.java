/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.arq.proformaapp.accesodb.AccesoSql;
import pe.arq.proformaapp.model.EmpleadoModel;

/**
 *
 * @author WIN 7
 */
public class LogonService {

    public EmpleadoModel validar(String user, String pass) {
        EmpleadoModel model = null;

        Connection cn = null;
        try {
            cn = AccesoSql.getConnection();
            String sql = "SELECT idEmpleado, nombre, apellido, dni, usuario FROM empleado WHERE usuario = ? AND clave = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, user);
            pstm.setString(2, pass);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                model = new EmpleadoModel();
                
                model.setIdEmpleado(rs.getString("idEmpleado"));
                model.setNombre(rs.getString("nombre"));
                model.setApellido(rs.getString("apellido"));
                model.setDni(rs.getString("dni"));
                model.setUsuario(rs.getString("usuario"));
            }
            rs.close();
            pstm.close();
            if (model == null) {
                throw new Exception("Datos incorrectos.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return model;
    }

}
