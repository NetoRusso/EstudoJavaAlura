package Curso02.Exercicios.Exercicios1.Exercicio02;

import java.util.Scanner;

public class AplicaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.dobro(10.2);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double numero1 = userInput.nextDouble();

        System.out.println("Digite a operação (+, -, * ou /)");
        char operacao = userInput.next().charAt(0);

        System.out.println("Digite o segundo numero: ");
        double numero2 = userInput.nextDouble();

        switch (operacao) {
            case '+':
                calculadora.soma(numero1, numero2);
                break;
            case '-':
                calculadora.subtracao(numero1, numero2);
                break;
            case '*':
                calculadora.multiplicacao(numero1, numero2);
                break;
            case '/':
                calculadora.divisao(numero1, numero2);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

    }
}
