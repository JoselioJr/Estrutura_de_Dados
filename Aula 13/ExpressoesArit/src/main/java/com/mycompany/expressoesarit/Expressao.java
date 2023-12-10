/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expressoesarit;
import java.util.Stack;

/**
 *
 * @author Joselio Jr
 */
public class Expressao {
    public boolean verificacao(String expressao){
        Stack<Character> pilha = new Stack<>();

        for (char caractere : expressao.toCharArray()){
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty() || !pares(pilha.pop(), caractere)) {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }

    public boolean pares(char aberto, char fechado){
        return (aberto == '(' && fechado == ')') || (aberto == '[' && fechado == ']') || (aberto == '{' && fechado == '}');
    }
}
