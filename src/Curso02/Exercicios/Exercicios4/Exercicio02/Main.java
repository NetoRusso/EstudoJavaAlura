package Curso02.Exercicios.Exercicios4.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Digite a largura da sala: ");
        double largura = userInput.nextDouble();

        System.out.println("Digite o comprimento da sala: ");
        double comprimento = userInput.nextDouble();

        System.out.println("A área da sala é: " + calculadora.calcularArea(largura, comprimento) + "m² 🤓.");
        System.out.println("e");
        System.out.println("O perímetro da sala é: " + calculadora.calcularPerímetro(largura, comprimento)+ "m 🤓.");

        userInput.close();

    }
}
