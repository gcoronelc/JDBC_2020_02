/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import pe.com.weimont.cafeteriawmj_s3.model_dto.ItemModel;

/**
 *
 * @author montespierreg
 */
public class Prueba22 {
    public static void main(String[] args) {
        int i;
        
        ItemModel[] arr = new ItemModel[3];
        arr[0] = new ItemModel(1, 2, 3, 4, 5, 6);
        arr[1] = new ItemModel(1, 2, 3, 4, 5, 6);
        arr[2] = new ItemModel(1, 2, 3, 4, 5, 6);
        
        i = 0;
        while(i<3){
            System.out.println(arr[i].getIdArticulo());
            i = i + 1;
        }
        
    }
    
}
