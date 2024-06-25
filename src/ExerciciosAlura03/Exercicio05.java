/*Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente. */

package ExerciciosAlura03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " é par 🟢");
        } else {
            System.out.println(numero + " é ímpar 🟡");
        }
        teclado.close();
    }
}
