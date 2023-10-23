/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoranpr;
import javax.swing.JOptionPane;
import java.util.Stack;

/**
 *
 * @author joseliojr
 */
public class CalculadoraNpr {

    public static void main(String[] args) {
        String operacao;
        String infixa;
        String prefixa;
        
        operacao = JOptionPane.showInputDialog("Digite a expressao Pro-fixa com seus elementos separados por epaco E(x.: 5 9 + 2 * 6 5 * +)..: ");
        infixa = JOptionPane.showInputDialog("Digite a mesma expressao na forma Infixa..: ");
        prefixa = JOptionPane.showInputDialog("Digite a mesma expressao na forma Pre-fixa..: ");
        
        double resultado = calcularNPR(operacao);
        
        System.out.println("-------------------Calculadora RPN-------------------");
        System.out.println("Expressao..: "+operacao);
        System.out.println("Resultado..: "+resultado);
        System.out.println("======================Expressoes======================");
        System.out.println("Infixa..: "+infixa);
        System.out.println("Pos-fixa..: "+operacao);
        System.out.println("Pre-fixa..: "+prefixa);
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
