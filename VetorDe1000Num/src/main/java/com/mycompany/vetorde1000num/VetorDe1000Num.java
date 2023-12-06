/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorde1000num;

/**
 *
 * @author joseliojr
 */
public class VetorDe1000Num {

    public static void main(String[] args) {
        int[] vetor = new int[1000];
        ListaDupla listdp = new ListaDupla();
        
        vetor[0] = 0;
        vetor[1] = 8;
        vetor[2] = 5;
        vetor[3] = 4;
        vetor[4] = 1;
        
        listdp.AdicionaNoComeco(vetor[0]);
        
        for(int y=0;y<5;y++){
            int x;
            x=(int)listdp.pega(y);
            
            System.out.println(listdp.imprimir());
            System.out.println("Valor de y..: "+y);
            System.out.println("Valor de x..: "+x);
            for(int i=y+1;i<5;i++){
                if(x>vetor[i]){
                    for(int h=0;h<5;h++){
                        if(vetor[i]>(int)listdp.pega(h)){
                            listdp.adiciona(h, vetor[i]);
                            System.out.println("Adicionando 1..: "+vetor[i]);
                        }
                    }
                    break;
                }else{
                    int g = listdp.tamanho();
                    
                    if(g==1){
                        listdp.adiciona(y+1, vetor[i]);
                        
                        System.out.println("Adicionando 2..: "+vetor[i]);
                        break;
                    }else{
                        for(int w=1;w<1000;w++){
                            if(vetor[i]<(int)listdp.pega(y+w)){
                                listdp.adiciona(y+w, vetor[i]);
                                
                                System.out.println("Adicionando 3..: "+vetor[i]);
                                break;
                            }else{
                                listdp.adiciona(vetor[i]);
                                
                                System.out.println("Adicionando 4..: "+vetor[i]);
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println(listdp.imprimir());
        /*for(int i=1;i<1001;i++){
            int x;
            x=(int)listdp.pega(i-1);
            
            if(x<vetor[i]){
                listdp.adiciona(vetor[i]);
            }else{
                listdp.adiciona(i-1, vetor[i]);
            }
        }*/
    }
}
