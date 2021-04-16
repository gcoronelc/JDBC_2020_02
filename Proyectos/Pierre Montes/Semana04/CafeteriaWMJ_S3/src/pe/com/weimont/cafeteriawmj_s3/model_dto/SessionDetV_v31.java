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
public class SessionDetV_v31 {
    
    public static int r;
    
    private static HashMap<Integer, ItemDetVenta> map995 ;
    
    static{
        map995 = new HashMap<Integer, ItemDetVenta>();
        int r = 0;
    }
    
    private SessionDetV_v31(){
    
    }
    
    public static void put (Integer key, ItemDetVenta map1){
        
        r = r + 1;
        
        map995.put(key, map1);
        
    }
    
    public static ItemDetVenta get (Integer key){
        return map995.get(key);
    }
        
}
