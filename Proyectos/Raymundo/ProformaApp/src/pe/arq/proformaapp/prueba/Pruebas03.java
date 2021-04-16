/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.prueba;

import java.sql.Connection;
import pe.arq.proformaapp.accesodb.AccesoSql;

/**
 *
 * @author WIN 7
 */
public class Pruebas03 {

    public static void main(String[] args) {
        try {
            Connection cn = AccesoSql.getConnection();
            System.out.println("Ok Sql");
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
