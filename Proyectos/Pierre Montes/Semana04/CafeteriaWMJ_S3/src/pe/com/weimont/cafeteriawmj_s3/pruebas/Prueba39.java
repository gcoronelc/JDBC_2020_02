/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import java.util.Map;
import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemConsVenta;
import pe.com.weimont.cafeteriawmj_s3.model_dto.SessionConsV_v3;

/**
 *
 * @author montespierreg
 */
public class Prueba39 {
    public static void main(String[] args) {
        
        ItemConsVenta ventaCons21 = new ItemConsVenta(3, 2, 1111,1111, 10, 15.5, 1.5, 17.5);
        ItemConsVenta ventaCons22 = new ItemConsVenta(4, 2, 1111,1111, 10, 15.5, 1.5, 17.5);
        ItemConsVenta ventaCons23 = new ItemConsVenta(5, 2, 1111,1111, 10, 15.5, 1.5, 17.5);
        
        SessionConsV_v3.put(1, ventaCons21);
        SessionConsV_v3.put(2, ventaCons22);
        SessionConsV_v3.put(3, ventaCons23);
        
        System.out.println(SessionConsV_v3.get(1).getIdVenta());
        System.out.println(SessionConsV_v3.get(2).getIdVenta());
        System.out.println(SessionConsV_v3.get(3).getIdVenta());
        //System.out.println(Session_v3.get(3).getIdVenta());
        
        
    }
}
