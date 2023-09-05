/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo356;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo356 {

    public static void main(String[] args) {
        int l, c=0, t, media[] = new int[15];
        String s1, s2, nomes[] = new String[15], sit[] = new String[15];
        float pr1[] = new float[15], pr2[] = new float[15];
        
        for(l=0;l<=14;l++){
            nomes[l] = JOptionPane.showInputDialog("\n\nDigite "+(l+1)+" nome: ");
            
            while(nomes[l].length()>30){
                System.out.println("\nNomes com ate 30 caracteres");
                nomes[l] = JOptionPane.showInputDialog("\n\nDigite "+(l+1)+" nome: ");
            }
            t=30-nomes[l].length();
            
            for(c=1;c<=t;c++){
                nomes[l]=(nomes[l]+" ");
            }
            
            s1 = JOptionPane.showInputDialog("\nDigite 1 nota: ");
            
            pr1[l] = Float.parseFloat(s1);
            
            s2 = JOptionPane.showInputDialog("\nDigite 2 nota: ");
            
            pr2[l] = Float.parseFloat(s2);
            media[l]=(int)((pr1[l]+pr2[l])/2+0.0001);
            
            if(media[l]>=5){
                sit[l]="AP";
            }else{
                sit[l]="RP";
            }
        }
        
        System.out.print("\n\n\n\t\t\t\tRELACAO FINAL\n");
        
        for(l=0;l<=14;l++){
            System.out.print("\n"+(l+1)+"- "+nomes[l]+"\t"+pr1[l]+"\t"+pr2[l]+"\t"+media[l]+"\t"+sit[l]);
        }
        System.out.println("\n");
    }
}
