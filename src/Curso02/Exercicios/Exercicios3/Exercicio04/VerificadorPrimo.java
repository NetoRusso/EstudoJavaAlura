package Curso02.Exercicios.Exercicios3.Exercicio04;

public class VerificadorPrimo extends NumerosPrimos {

    public void verificarSeEhPrimo(int numero) {
        if (verificadorPrimalidade(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
