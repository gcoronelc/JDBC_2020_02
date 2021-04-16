/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.model_dto;

import java.util.HashMap;

/**
 *
 * @author montespierreg
 */
public class SessionConsV_v3 {
    
    
    
    private static HashMap<Integer, ItemConsVenta> map994 ;
    
    static{
        map994 = new HashMap<Integer, ItemConsVenta>();
        //int i = 0;
    }
    
    private SessionConsV_v3(){
    
    }
    
    public static void put (Integer key, ItemConsVenta map1){
        
        //int a = map994.size();
        //map994.put(a + 1, map1);
        
        map994.put(key, map1);
        
    }
    
    public static ItemConsVenta get (Integer key){
        return map994.get(key);
    }
        
}
