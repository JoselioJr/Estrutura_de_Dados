/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algo481;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Algo481 {
    
    public static int converte(int nnum, int nbase){
        int nb, r, b;

        b=0;
        nb=0;

        while(nnum>=nbase){
            r=nnum%nbase;
            nb=(int) (nb+Math.pow( 10, b)*r);
            nnum=nnum/nbase;
            b++;
        }

        nb=(int) (nb+Math.pow( 10, b)*nnum);

        return(nb);
    }

    public static void main(String[] args) {
        String s;
        int num, base, c;
        
        s = JOptionPane.showInputDialog("\nDigite numeto maior ou igual a 0: ");
        
        num = Integer.parseInt(s);
        
        while(num<0){
            s = JOptionPane.showInputDialog("\nNumero negativo. Digite numeto maior ou igual a 0: ");
        
            num = Integer.parseInt(s);
        }
        
        s = JOptionPane.showInputDialog("Digite a base em deseja representa-lo(2-10): ");
            
        base = Integer.parseInt(s);
        
        while(base<2 || base>10){
            s = JOptionPane.showInputDialog("Nao se converter. Digite a base em deseja representa-lo(2-10): ");
            
            base = Integer.parseInt(s);
        }
        
        c=converte(num, base);
        
        System.out.println("\nNumero em decimal: "+num);
        System.out.println("\nNumero na base "+base+" : "+c);
        System.out.println("\n\n");
        
    }
}
