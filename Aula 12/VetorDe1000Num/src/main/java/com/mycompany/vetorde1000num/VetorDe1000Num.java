/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorde1000num;
import java.util.Random;

/**
 *
 * @author joseliojr
 */
public class VetorDe1000Num {

    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random random = new Random();
        
        ListaDupla listdp = new ListaDupla();
        
        System.out.println("Vetor de numeros aleatorios desordenados..: ");
        System.out.print("[");
        for(int a=0;a<1000;a++){
            vetor[a] = random.nextInt(9999);
            
            System.out.print(vetor[a]+", ");
        }
        System.out.println("]\n");
        
        System.out.println("Vetor de numeros aleatorios em ordem crescente..: ");
        
        listdp.AdicionaNoComeco(vetor[0]);
        
        for(int y=1;y<1000;y++){
            for(int i=0;i<1000;i++){
                if(vetor[y]<(int)listdp.pega(i)){
                    if(i!=0){
                        listdp.adiciona(i-1, vetor[y]);
                    }else{
                        listdp.adiciona(i, vetor[y]);
                    }
                }else{
                    for(int w=1;w<1000;w++){
                        if(vetor[y]<(int)listdp.pega(i+w)){
                            listdp.adiciona(i+w, vetor[y]);
                            break;
                        }
                        if(vetor[y]>(int)listdp.pega(listdp.tamanho()-1)){
                            listdp.adiciona(vetor[y]);
                            break;
                        }
                    }
                }
                break;
            }
        }

        System.out.println(listdp.imprimir()+"\n");

        System.out.println("Vetor de numeros aleatorios em ordem decrescente..: ");
        System.out.print("[");
        for(int k=0;k<1000;k++){
            System.out.print(listdp.pega((listdp.tamanho()-1)-k)+", ");
        }
        System.out.println("]\n");
        
        System.out.println("Removendo números primos da lista:");
        /*listdp.removeNumerosPrimos();
        System.out.println("Lista sem primos: " + listdp.imprimir());*/
    }
}