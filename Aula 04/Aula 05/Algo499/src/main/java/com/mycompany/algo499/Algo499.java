/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo499;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo499 {
    
    public static int entrada(int vet[], int t){
        String s;
        int l;
        
        System.out.println("\nEntrada do VETOR\n");
        
        for(l=0;l<t;l++){
            s = JOptionPane.showInputDialog("Digite numero "+(l+1)+": ");
            vet[l]=Integer.parseInt(s);
        }
        l=0;
        l++;
        return(vet[l]);
    }
    
    public static int imprime(int vet[], int t){
        int l;
        
        System.out.println("\nVETOR\n");
        
        for(l=0;l<t;l++){
            System.out.println("\n"+(l+1)+" - "+vet[l]);
        }
        l=0;
        l++;
        return(vet[l]);
    }
    
    public static int ordena(int vet[], int tam){
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
        l1=0;
        l1++;
        return(vet[l1);
    }

    public static void main(String[] args) {
        String s;
        int num[] = new int[5], l, flag, op;
        
        flag=0;
        
        for(l=0;l<5;l++){
            num[l]=0;
        }
        
        do{
            System.out.println("\n\n\n");
            System.out.println("\nMENU VETOR - FUNCAO\n");
            System.out.println("\n1 - Dados do vetor");
            System.out.println("\n2 - Ordena vetor");
            System.out.println("\n3 - Imprime vetor");
            System.out.println("\n4 - Sai do programa");
            s = JOptionPane.showInputDialog("OPCAO: ");
            
            op = Integer.parseInt(s);
            
            switch(op){
                case 1: 
                    entrada(num, 5);
                    flag=1;
                    break;
                
                case 2:
                    if(flag==1){
                        ordena(num, 5);
                    }else{
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;
                    
                case 3:
                    if(flag==1){
                        ordena(num, 5);
                    }else{
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;
                    
                case 4:
                    System.out.println("\nSaindo do algoritmo");
                    break;
            }
            
            if(op>4){
                System.out.println("Opcao invalida");
            }
        }
        
        while(op!=4);{
            System.out.println("\n");
        }
    }
}
