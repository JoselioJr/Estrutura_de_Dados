/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo358;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo358 {

    public static void main(String[] args) {
        String s1, s2;
        float precoCompra[] = new float[100], precoVenda[] = new float[100], lucro;
        int totLucroMenor10=0, totLucroMenor20=0, totLucroMaior20=0, a;
        
        for(a=0;a<100;a++){
            s1 = JOptionPane.showInputDialog("\nPreco de compra: ");
            precoCompra[a] = Float.parseFloat(s1);
            
            s2 = JOptionPane.showInputDialog("\nPreco de venda: ");
            precoVenda[a] = Float.parseFloat(s2);
        }
        for(a=0;a<100;a++){
            lucro=precoVenda[a]-precoCompra[a];
            
            if(lucro<10.0){
                totLucroMenor10++;
            }else{
                if(lucro<=20.0){
                    totLucroMenor20++;
                }else{
                    totLucroMaior20++;
                }
            }
        }
        System.out.println("\nTotal de mercadorias com lucro < 10%: "+totLucroMenor10);
        System.out.println("\nTotal de mercadorias com 10% <= lucro <= 20%: "+totLucroMenor20);
        System.out.println("\nTotal de mercadorias com lucro > 20%: "+totLucroMaior20);
        System.out.println("\n");
    }
}
