/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.model_dto;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author montespierreg
 */
public class Borrar {
    public static Map<Integer, Object> myMap1 = new TreeMap<Integer, Object>();
    
    
    ItemDetVenta item1 = new ItemDetVenta(1, 2, 2, 10, 4, 40);
    ItemDetVenta item2 = new ItemDetVenta(1, 2, 2, 10, 4, 40);
    static {
        myMap1.put(1, Math.PI);
        myMap1.put(2, Math.PI);
    }
}
