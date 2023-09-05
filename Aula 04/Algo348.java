/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo348;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo348 {

    public static void main(String[] args) {
        int l;
        String s1, s2;
        String nomes[] = new String[5];
        float pr1[] = new float[5];
        float pr2[] = new float[5];
        float media[] = new float[5];
        
        for(l=0;l<=4;l++){
            nomes[l] = JOptionPane.showInputDialog("\ndigite "+(l+1)+" nome: ");
            
            s1 = JOptionPane.showInputDialog("digite 1 nota: ");
            
            pr1[l] = Float.parseFloat(s1);
            
            s2 = JOptionPane.showInputDialog("digite 2 nota: ");
            
            pr2[l] = Float.parseFloat(s2);
            
            media[l]=(pr1[l]+pr2[l])/2;
        }
        
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
        
        for(l=0;l<=4;l++){
            System.out.println("\n"+(l+1)+"- "+nomes[l]);
            
            System.out.println("\n"+pr1[l]+"\t"+pr2[l]+"\t"+media[l]);
        }
        System.out.println("\n");
    }
}
