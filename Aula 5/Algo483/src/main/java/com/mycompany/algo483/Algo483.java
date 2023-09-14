/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo483;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo483 {
    
    public static int produtointerno(int vet1[], int vet2[], int quant){
        int prod, i;

        prod=0;

        for(i=0;i<quant;i++){
            prod=prod+(vet1[i]*vet2[i]);
        }

        return (prod);
    }

    public static void main(String[] args) {
        String s;
        int l, c, num[] = new int[4], num1[] = new int[4];
        
        for(l=0;l<4;l++){
            s = JOptionPane.showInputDialog("\n\nDigite 1 numero "+(l+1)+": ");
            num[l] = Integer.parseInt(s);
        }
        for(l=0;l<4;l++){
            s = JOptionPane.showInputDialog("\n\nDigite 2 numero "+(l+1)+": ");
            num1[l] = Integer.parseInt(s);
        }
        
        c=produtointerno(num, num1, 4);
        
        System.out.println("\nVETOR A\t VETOR B\n");
        
        for(l=0;l<4;l++){
            System.out.println("\n"+num[l]+"\t"+num1[l]);
        }
        
        System.out.println("\n\nProduto interno: "+c);
        System.out.println("\n");
    }
}
