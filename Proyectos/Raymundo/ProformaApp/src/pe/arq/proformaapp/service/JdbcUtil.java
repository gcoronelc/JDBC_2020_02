/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.service;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author WIN 7
 */
public final class JdbcUtil {

    private JdbcUtil() {
    }

    public static List<Map<String, ?>> rsToList(ResultSet rs) throws SQLException {
        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();
        List<Map<String, ?>> results = new ArrayList<Map<String, ?>>();
        while (rs.next()) {
            Map<String, Object> row = new HashMap<String, Object>();
            for (int i = 1; i <= columns; i++) {
                row.put(md.getColumnLabel(i), rs.getObject(i));
            }
            results.add(row);
        }
        return results;
    }

}
