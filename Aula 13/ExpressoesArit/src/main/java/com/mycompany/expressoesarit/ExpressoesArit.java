/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expressoesarit;
import javax.swing.JOptionPane;

/**
 *
 * @author Joselio Jr
 */
public class ExpressoesArit {

    public static void main(String[] args) {
        String s;
        Expressao espec = new Expressao();
        
        s = JOptionPane.showInputDialog("Digite a expressão matemática: ");

        if (espec.verificacao(s)){
            System.out.println("Expressão correta!");
        } else {
            System.out.println("Expressão incorreta!");
        }
    }
}