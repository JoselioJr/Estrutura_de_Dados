/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inverterordem;
import java.util.Stack;

/**
 *
 * @author joseliojr
 */
public class InverterOrdem {

    public static void main(String[] args) {
        Stack<Character> p1 = new Stack<>();
        Stack<Character> p2 = new Stack<>();
        String[] text = new String[2]; 
        text[0] = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        text[1] = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";
        
        System.out.println("--------------------TEXTOS ANTES DA INVERSAO--------------------\n");
        System.out.println("Texto 1..:\n"+text[0]+"\n");
        System.out.println("Texto 2..:\n"+text[1]+"\n");
        System.out.println("--------------------TEXTOS APOS A INVERSAO----------------------\n");
        
        for(int i=0;i<2;i++){
            for(int a=0;a<text[i].length();a++){
                if(text[i].charAt(a)!=' '){
                    p1.push(text[i].charAt(a));
                }else{
                        while(!p1.empty()){
                            p2.push(p1.pop());
                        }
                        p2.push(' ');
                    }
            }

            while(!p2.empty()){
                p1.push(p2.pop());
            }
            
            System.out.println("Texto "+(i+1)+"..:");

            while(!p1.empty()){
                System.out.print(p1.pop());
            }
            System.out.println("\n");
        }
    }
}
 