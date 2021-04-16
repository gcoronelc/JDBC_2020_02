/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;


import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author montespierreg
 */
public class Prueba26 {
    public static void main(String[] args) {
        //Fecha para mysql
        Date today = Calendar.getInstance().getTime();
        long today2 = Calendar.getInstance().getTimeInMillis();
        System.out.println(today);
        System.out.println(today2);
        //Output: Thu Oct 01 18:46:50 PET 2020
        //1601596010132
    }
}
