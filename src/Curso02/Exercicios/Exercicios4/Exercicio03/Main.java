package Curso02.Exercicios.Exercicios4.Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = userInput.nextInt();

        tabuada.mostrarTabuada(numero);

        userInput.close();

    }
}
