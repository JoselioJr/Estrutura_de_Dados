/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoranpr;
import java.util.Stack;

/**
 *
 * @author joseliojr
 */
public class CalculadoraNpr {

    public static void main(String[] args) {
        String operacao = "5 9 + 2 * 6 5 * +";
        String infixa = "(5 + 9) * 2 + 6 * 5";
        String preFixa = "+ * + 5 9 2 * 6 5";
        double resultado = calcularNPR(operacao);
        
        System.out.println("Expressao..:"+operacao);
        System.out.println("Resultado..: "+resultado);
        System.out.println("------------------------------");
        System.out.println("Infixa..:"+infixa);
        System.out.println("Pos-fixa..:"+operacao);
        System.out.println("Pre-fixa..:"+preFixa);
    }

    public static double calcularNPR(String ope){
        Stack<Double> pilha = new Stack<>();
        Calculadora calc = new Calculadora();

        String[] elements = ope.split(" ");

        for (String num : elements){
            if (num.matches("-?\\d+(\\.\\d+)?")){
                double numero = Double.parseDouble(num);
                pilha.push(numero);
            }
            
            switch(num){
                case "+":
                    pilha.push(calc.soma(pilha.pop(), pilha.pop()));
                    break;
                case "-":
                    pilha.push(calc.sub(pilha.pop(), pilha.pop()));
                    break;
                case "*":
                    pilha.push(calc.mult(pilha.pop(), pilha.pop()));
                    break;
                case "/":
                    pilha.push(calc.div(pilha.pop(), pilha.pop()));
                    break;
            }
        }
        
        return pilha.pop();
    }
}
