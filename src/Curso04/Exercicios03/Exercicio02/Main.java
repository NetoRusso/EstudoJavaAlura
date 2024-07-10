package Curso04.Exercicios03.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = userInput.nextLine();

        try {
            if (senha.length() < 8) {
                throw new SenhaInvalidaException("A senha deve ter no minimo 8 caracteres");
            }

            if (!senha.matches("[A-Za-z0-9]+")) {
                throw new SenhaInvalidaException("A senha deve conter apenas caracteres alfa-numericos");
            } else {
                System.out.println("Digite novamente a senha: ");
                String senha2 = userInput.nextLine();

                if (senha.equals(senha2)) {
                    System.out.println("Senha valida");
                } else {
                    throw new SenhaInvalidaException("As senhas digitadas não coincidem");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            userInput.close();
            System.out.println("Fim do programa");
        }
    }
}
