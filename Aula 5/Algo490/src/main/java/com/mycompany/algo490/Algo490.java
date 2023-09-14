/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo490;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo490 {
    
    public static int restantes(String vet[], int tam, String x){
        int i, cont;
        cont=0;

        for(i=0;i<tam;i++){
            if(vet[i]==x)){
                vet[i]="*";
                cont++;
            }
        }
        return(cont);
    }

    public static void main(String[] args) {
        String nome[] = new String[10];
        int l;
        
        for(l=0;l<10;l++){
            nome[l] = JOptionPane.showInputDialog("Digite palavra em letras minusculas "+(l+1)+": ");
            
            restantes(nome, nome[l].length(), "c");
        }
        
        for(l=0;l<10;l++){
            System.out.println("\n"+(l+1)+" - "+nome[l]);
            System.out.println("\n");
        }
    }
}
