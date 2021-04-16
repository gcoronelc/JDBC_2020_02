/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.arq.proformaapp.util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author WIN 7
 */
public class Mensaje {
    
    private Mensaje(){
    }
    
    public static void info(Component padre, String mensaje){
        JOptionPane.showMessageDialog(padre, mensaje,"INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);  
    }
    
    public static void error(Component padre, String mensaje){
        JOptionPane.showMessageDialog(padre, mensaje,"ERROR", JOptionPane.ERROR_MESSAGE);
        
    }
}
