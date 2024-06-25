/*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/

package ExerciciosAlura03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        int  limitador = 10 * numero;
        for (int i = 1; i * numero <= limitador; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i + " 🤓 ");
        }

        teclado.close();
    }
}
