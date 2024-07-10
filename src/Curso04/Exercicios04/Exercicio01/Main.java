package Curso04.Exercicios04.Exercicio01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Digite a mensagem: ");
        String mensagem = userInput.nextLine();

        FileWriter escrita = new FileWriter("mensagem.txt");

        try {
            escrita.write(mensagem);
            System.out.println("Mensagem salva com sucesso!");
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            userInput.close();
            escrita.close();
        }

    }
}
