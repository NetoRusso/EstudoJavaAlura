package Curso01JavaComOrientacaoAObjetos;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento do filme? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual a nota do filme? ");
        double nota = leitura.nextDouble();

        System.out.println("Seu filme favorito é: " + filme + " e seu ano de lançamento é: " + anoDeLancamento + " e sua nota é: " + nota);
        leitura.close();
    }
}
