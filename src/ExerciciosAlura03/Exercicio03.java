/*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. */

package ExerciciosAlura03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("""
                   🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️🖥️
                   
                   O que deseja fazer?
                   
                   Digite 1 para calcular a área do quadrado 🟦
                   
                   Digite 2 para calcular a área do círculo 🟠
                   
                   Digite 3 para calcular a área do triângulo 🔺
                   
                   🌟✨🌟✨🌟✨🌟✨🌟✨🌟✨🌟✨🌟✨🌟✨🌟✨🌟✨🌟✨🌟✨🌟✨
                   """);
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Área do Quadrado! 🟨");
                System.out.println("Digite o valor do lado do quadrado em cm: ");
                double lado = teclado.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é " + areaQuadrado + " cm² 🟦");
                System.out.println("Programa finalizado! Muito Obrigado! 🤓");
                break;

            case 2:
                System.out.println("Área do Círculo! 🟣");

                System.out.println("Digite o valor do raio do círculo em cm: ");
                double raio = teclado.nextDouble();
                double areaCirculo = Math.PI * (raio * raio);
                System.out.println("A área do círculo é " + areaCirculo + " cm² 🟠");
                System.out.println("Programa finalizado! Muito Obrigado! 🤓");
                break;

            case 3:
                System.out.println("Área do Triângulo! 🔺");

                System.out.println("Digite o valor da base do triângulo em cm: ");
                double base = teclado.nextDouble();

                System.out.println("Digite o valor da Altura do triângulo em cm: ");
                double altura = teclado.nextDouble();

                double areaTriangulo = base * altura / 2;
                System.out.println("A área do triângulo é " + areaTriangulo + " cm² 🔺");
                System.out.println("Programa finalizado! Muito Obrigado! 🤓");
                break;

            default:
                System.out.println("Opção inválida 😥");
        }


        teclado.close();
    }
}
