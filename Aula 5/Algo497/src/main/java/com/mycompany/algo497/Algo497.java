/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo497;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo497 {
    
    public static int busca(int vet[], int tam, int chave){
        int ini, meio, fim;

        ini=0;
        fim=tam-1;

        while(ini<=fim){
            meio=(ini+fim)/2;

            if(chave==vet[meio]){
                return(meio);
            }else{
                if(chave<vet[meio]){
                    fim=meio-1;
                }else{
                    ini=meio+1;
                }
            }
        }
        meio=(-1);
        return(meio);
    }

    public static void ordena(int vet[], int tam){
       int l1, c1, aux;

       for(l1=0;l1<tam-1;l1++){
           for(c1=l1+1;c1<tam;c1++){
               if(vet[l1]>vet[c1]){
                   aux=vet[l1];
                   vet[l1]=vet[c1];
                   vet[c1]=aux;
               }
           }
       }
    }

    public static void main(String[] args) {
        String s;
        int l, c, num[] = new int[10], n;
        
        for(l=0;l<10;l++){
            s = JOptionPane.showInputDialog("Digite numero "+(l+1)+": ");
            
            num[l] = Integer.parseInt(s);
        }
        
        s = JOptionPane.showInputDialog("Digite numero de busca: ");
            
        n = Integer.parseInt(s);
        
        ordena(num, 10);
        
        c=busca(num, 10, n);
        
        System.out.println("\nVETOR\n");
        
        for(l=0;l<10;l++){
            System.out.println("\n"+(l+1)+" - "+num[l]);
        }
        
        c++;
        
        if(c!=0){
            System.out.println("\n\nPosicao do vetor: "+c);
        }else{
            System.out.println("\n\nNAO ENCONTRADO");
        }
        System.out.println("\n");
    }
}
