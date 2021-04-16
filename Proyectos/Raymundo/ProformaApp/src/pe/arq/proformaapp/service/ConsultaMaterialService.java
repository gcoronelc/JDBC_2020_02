/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.arq.proformaapp.accesodb.AccesoSql;

/**
 *
 * @author WIN 7
 */
public class ConsultaMaterialService {
    
     public List<Map<String, ?>> getMovimientos(String cuenta) {
        List<Map<String, ?>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoSql.getConnection();
            String sql = "select idMaterial, nombre, unidad from material where idMaterial = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, cuenta);
            ResultSet rs = pstm.executeQuery();
            lista = JdbcUtil.rsToList(rs);
            rs.close();
            pstm.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }
    
}
