/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.josephus;
import javax.swing.JOptionPane;

/**
 *
 * @author joseliojr
 */
public class Josephus {

    public static void main(String[] args) {
        String s;
        int m;
        Pessoas sobr = new Pessoas();
        
        s = JOptionPane.showInputDialog("Digite o m-esimo para calculo..: ");
        m = Integer.parseInt(s);
        
        int indiceSob = sobr.sobrevivente(m);
        
        Dados busca = null;
        for(Dados pessoa : sobr.getListaDePessoas()){
            if(pessoa.getNumero() == indiceSob){
                busca = pessoa;
                break;
            }
        }
        
        System.out.println("-------------------Sobrevivente-------------------");
        System.out.println("Número do sobrevivente..: "+busca.numero);
        System.out.println("Nome..: "+busca.nome);
        System.out.println("Telefone..: "+busca.telefone);
        System.out.println("Endereco..: "+busca.endereco);
        System.out.println("CPF..: "+busca.cpf);
        System.out.println("--------------------------------------------------");
    }
}
