/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.service;

import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemConsVenta;
import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemDetVenta;
import pe.com.weimont.cafeteriawmj_s3.model_dto.SessionConsV_v3;
import pe.com.weimont.cafeteriawmj_s3.model_dto.SessionDetV_v31;

/**
 *
 * @author montespierreg
 */
public class VentaService {
    
    public static int contador;
    
    static{
        contador = 0;
    }
    
    public static void registrarVentaCons(ItemConsVenta obj1){
        SessionConsV_v3.put(1, obj1);
    }
    
    public static void agregarItemVentaDet(ItemDetVenta obj2){
        
        contador = contador + 1;
        
        SessionDetV_v31.put(contador, obj2);
        
        
        
    }
    
    public static void leerItemsVentaDet(ItemDetVenta obj2){
        
        
        int a = 1;
        
        while(a <= contador){
            System.out.println(SessionDetV_v31.get(a).getIdDet_Venta());
            
            a = a +1;
        }
    }

}
