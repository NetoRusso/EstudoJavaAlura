package Curso02.Exercicios.Exercicios2.Exercicio01;

public class Cliente {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroDaConta(123456);
        conta.titular = "Joao Maluco";

        conta.mostrarDados();

    }
}
