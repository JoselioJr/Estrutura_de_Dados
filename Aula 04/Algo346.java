/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo346;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo346 {

    public static void main(String[] args) {
        String frase, s;
        int op, x, tam;
        
        do{
            System.out.println("\nMENU");
            System.out.println("\n1 - Imprime o comprimento da frase");
            System.out.println("\n2 - Imprime os dois primeiros e os dois ultimos carcteres da frase");
            System.out.println("\n3 - Imprime a frase espelhada");
            System.out.println("\n4 - Termina o algoritmo");
            
            s = JOptionPane.showInputDialog("\nOPCAO: ");
            op = Integer.parseInt(s);
            
            if(op==1){
                frase = JOptionPane.showInputDialog("\nDigite uma frase: ");
                
                System.out.println("\nNumero de caracteres da frase: "+frase.length());
            }else{
                if(op==2){
                    frase = JOptionPane.showInputDialog("\nDigite uma frase: ");
                    
                    System.out.println("\nOs dois primeiros caracteres: "+frase.substring(0, 2));
                    tam = frase.length()-2;
                    System.out.println("\nOs dois ultimos caracteres: "+frase.substring(tam));
                }else{
                    if(op==3){
                        frase = JOptionPane.showInputDialog("\nDigite uma frase: ");
                        
                        for(x = frase.length()-1;x>=0;x--){
                            System.out.println(frase.charAt(x));
                        }
                    }else{
                        if(op==4){
                            System.out.println("\nFim do algoritmo");
                        }else{
                            System.out.println("\nOpcao nao disponivel");
                        }
                    }
                }
            }
            System.out.println("\n\n");
        }
        while(op!=4);{
            System.out.println("\n\n");        
        }
    }
}
