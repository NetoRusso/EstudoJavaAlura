import java.util.Scanner;

public class Soma {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema do Bora Codar!");
        System.out.println();

        System.out.println("Primeiro número");
        double numero1 = entrada.nextDouble();
        System.out.println("Segundo número");
        double numero2 = entrada.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multipicacao = numero1 * numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multipicacao);

        entrada.close();

    }
}
