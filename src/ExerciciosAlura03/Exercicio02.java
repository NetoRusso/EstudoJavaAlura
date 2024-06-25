/*Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior. */

package ExerciciosAlura03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = teclado.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais " + numero1);
        }   else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O segundo número é maior " + numero2);
        }

        teclado.close();

    }
}
