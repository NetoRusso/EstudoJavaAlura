//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
package ExerciciosAlura03;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + "! é " + fatorial);

        teclado.close();

    }
}
