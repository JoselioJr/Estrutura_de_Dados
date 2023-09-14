/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo485;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo485 {
    
    public static void multivetor(int vet1[], String vet2[], int tam){
        int i, w;

        for(i=0;i<tam;i++){
            System.out.print("\n");

            for(w=0;w<vet1[i];w++){
                System.out.print(vet2[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s, num1[] = new String[6];
        int l, num[] = new int[6];
        
        for(l=0;l<6;l++){
            s = JOptionPane.showInputDialog("Digite numero: "+(l+1)+": ");
            num[l] = Integer.parseInt(s);
        }
        for(l=0;l<6;l++){
            num1[l] = JOptionPane.showInputDialog("Digite caractere: "+(l+1)+": ");
        }
        System.out.println("\n");
        
        multivetor(num, num1, 6); 
        
        System.out.println("\n");
    }
}
