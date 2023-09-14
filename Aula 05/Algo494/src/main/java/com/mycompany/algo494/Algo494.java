/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo494;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo494 {
    
    public static void troca(String n1, String n2){
        String aux;

        aux=n1;
        n1=n2;
        n2=aux;
    }

    public static void main(String[] args) {
        int l, c;
        String nome[] = new String[3], prof[] = new String[3], ender[] = new String[3];
        
        for(l=0;l<3;l++){
            nome[l] = JOptionPane.showInputDialog("Digite nome: ");
            
            ender[l] = JOptionPane.showInputDialog("Digite endereco: ");
            
            prof[l] = JOptionPane.showInputDialog("Digite profissao: ");
        }
        for(l=0;l<2;l++){
            for(c=l+1;c<3;c++){
                if(nome[l].length()>nome[c].length()){
                    troca(nome[l], nome[c]);
                    troca(ender[l], ender[c]);
                }
            }
        }
        for(l=0;l<3;l++){
            System.out.println("\n"+nome[l]+"\t"+ender[l]+"\t"+prof[l]);
        }
        System.out.println("\n");
    }
}
