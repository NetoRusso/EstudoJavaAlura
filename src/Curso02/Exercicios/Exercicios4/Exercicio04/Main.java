package Curso02.Exercicios.Exercicios4.Exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversorTemperatura converter = new ConversorDeTemperaturaPadrao();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de conversão de temperatura 🌡️ ");
        System.out.println("****************************************");
        System.out.println("""
                                
                Digite 1 para converter de Celsius para Fahrenheit;
                                
                Digite 2 para converter de Fahrenheit para Celsius;
                                
                Digite 0 para sair;
                                
                ******************************************************
                """);
        int opicao = userInput.nextInt();

        if (opicao == 0) {
            System.out.println("Saiu do programa 👋");
            System.exit(0);
            userInput.close();
        } else if (opicao == 1) {
            System.out.println("Digite o valor a ser convertido: ");
            double valor = userInput.nextDouble();
            System.out.println("Valor convertido: " + converter.celsiusParaFahrenheit(valor) + " °F🌡️");
        } else if (opicao == 2) {
            System.out.println("Digite o valor a ser convertido: ");
            double valor = userInput.nextDouble();
            System.out.println("Valor convertido: " + converter.fahrenheitParaCelsius(valor) + " °C🌡️");
        }
        userInput.nextLine();


        userInput.close();


    }
}
