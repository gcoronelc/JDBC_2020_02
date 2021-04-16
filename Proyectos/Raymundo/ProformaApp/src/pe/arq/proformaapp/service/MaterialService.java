
package pe.arq.proformaapp.service;

import java.sql.Connection;
import pe.arq.proformaapp.accesodb.AccesoSql;

public class MaterialService {

        public void registrarMaterial(String nombre, String unidad) {
        Connection cn = null;
        try {
            cn = AccesoSql.getConnection();
            cn.setAutoCommit(false);
            
            cn.commit();
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            throw new RuntimeException("Error en el registro. " + e.getMessage());
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

}
