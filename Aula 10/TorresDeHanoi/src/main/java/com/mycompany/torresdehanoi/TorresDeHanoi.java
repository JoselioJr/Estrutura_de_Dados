/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torresdehanoi;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class TorresDeHanoi {

    public static void main(String[] args) {
        String s;
        Long x;
        MovimentosDisc mover = new MovimentosDisc();
        
        s = JOptionPane.showInputDialog("Digite a quantidade de discos..: ");
        x = Long.valueOf(s);
        System.out.println("----------------------------------REGRAS----------------------------------\n");
        System.out.println("* Apenas um disco poderia ser movido por vez");
        System.out.println("* Nunca um disco maior deverá ficar por cima de um disco menor\n");
        System.out.println("Quantidade de movimentos para mover "+x+" discos..: "+mover.movimentos(x)+" movimentos");
    }
}
