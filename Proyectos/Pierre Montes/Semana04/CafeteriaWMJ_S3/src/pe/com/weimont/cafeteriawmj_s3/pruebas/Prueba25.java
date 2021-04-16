/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import java.sql.Date;

/**
 *
 * @author montespierreg
 */
public class Prueba25 {
    public static void main(String[] args) {
        //Fecha para mysql
        Date dte = new Date(2020, 10, 1);
        long milisegundos = dte.getTime();
        System.out.println(milisegundos);
        //Output: 61562350800000
    }
}
