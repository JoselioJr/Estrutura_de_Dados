/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo360;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo360 {

    public static void main(String[] args) {
        int ultDia[] = new int[12], data, i, dia, mes;
        String signo[] = new String[12], s;
        
        for(i=0;i<12;i++){
            signo[i] = JOptionPane.showInputDialog("\nDigite signo: ");
            
            s = JOptionPane.showInputDialog("\nDigite ultimo dia: ");
            
            ultDia[i] = Integer.parseInt(s);
        }
        s = JOptionPane.showInputDialog("\nDigite data no formato ddmm ou 9999 para terminar: ");
        
        data = Integer.parseInt(s);
        
        while(data != 9999){
            dia=data/100;
            mes=data%100;
            mes--;
            
            if(dia>ultDia[mes]){
                mes=(mes+1)%12;
            }
            System.out.println("\nSigno: "+signo[mes]+"\n");
            s = JOptionPane.showInputDialog("\nDigite data no formato ddmm ou 9999 para terminar: ");
            
            data = Integer.parseInt(s);
        }
        System.out.println("\n");
    }
}
