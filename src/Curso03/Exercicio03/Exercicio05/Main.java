package Curso03.Exercicio03.Exercicio05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DecimalFormat formato = new DecimalFormat("0.00");

        Scanner userInput = new Scanner(System.in);

        System.out.println("""
                Digite 1 para quadrado
                Digite 2 para circulo
                """);
        int opcao = userInput.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o lado do quadrado em cm");
            double lado = userInput.nextDouble();
            var quadrado = new Quadrado(lado);
            System.out.println("Area do quadrado : " + formato.format(quadrado.calcularArea()) + " cm²");
        } else if (opcao == 2) {
            System.out.println("Digite o raio do circulo em cm");
            double raio = userInput.nextDouble();
            var circulo = new Circulo(raio);
            System.out.println("Area do circulo : " + formato.format(circulo.calcularArea()) + " cm²");
        } else {
            System.out.println("Opção inválida");
            System.exit(0);
        }

        userInput.close();


    }
}
