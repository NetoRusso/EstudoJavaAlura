package Curso03.Exercicio05.Exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = userInput.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = userInput.nextInt();

        try {
            double resultado = numero1 / numero2;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Houve um erro de divisao");
            System.out.println(e.getMessage());
        } finally {
            userInput.close();
            System.out.println("Fim do programa");
        }
    }
}
