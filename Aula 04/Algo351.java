/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo351;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo351 {

    public static void main(String[] args) {
        int l, num;
        String nomes[] = new String[5];
        String s;
        
        for(l=0;l<=4;l++){
            nomes[l] = JOptionPane.showInputDialog("\nnome "+(l+1)+": ");
        }
        
        s = JOptionPane.showInputDialog("\nDigite o numero da pessoa: ");
        num = Integer.parseInt(s);
        
        while(num<1 || num>5){
            System.out.println("\n Numero fora do intervalo");
            s = JOptionPane.showInputDialog("\nDigite o numero da pessoa: ");
            num = Integer.parseInt(s);
        }
        System.out.println("\n"+nomes[num-1]);
        System.out.println("\n");
    }
}
