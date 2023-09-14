/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo487;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo487 {
    
    public static void inverte(int vet[], int max){
        int k, i, aux;

        k=max;

        for(i=0;i<max/2;i++){
            aux=vet[i];
            k--;

            vet[i]=vet[k];
            vet[k]=aux;
        }
    }

    public static void main(String[] args) {
        String s;
        int l, num[] = new int[10];
        
        for(l=0;l<10;l++){
            s = JOptionPane.showInputDialog("Digite numero "+(l+1)+": ");
            num[l] = Integer.parseInt(s);
        }
        
        inverte(num, 10);
        
        System.out.println("\nVETOR\n");
        
        for(l=0;l<10;l++){
            System.out.println("\n"+(l+1)+" - "+num[l]);
        }
        System.out.println("\n");
    }
}
