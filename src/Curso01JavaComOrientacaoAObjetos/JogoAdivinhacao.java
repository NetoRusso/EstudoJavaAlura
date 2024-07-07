package Curso01JavaComOrientacaoAObjetos;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int secreto = new Random().nextInt(1000);
        int chute = 0;
        int contador = 0;

        while (secreto != chute) {
            System.out.println("Digite um número entre 0 e 999: ");
            chute = teclado.nextInt();
            contador++;
            if (chute < secreto) {
                System.out.println("O número secreto é maior! ⬆️ ");
            } else if (chute > secreto) {
                System.out.println("O número secreto é menor! ⬇️");
            } else {
                System.out.println("Parabéns você acertou 🌟 em " + contador + " tentativas!");
            }
        }

        teclado.close();

    }
}
