/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author montespierreg
 */
public class Prueba27 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String dateString = sdf.format(date);
        System.out.println(dateString);
    }
}
