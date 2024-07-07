package Curso02.Exercicios.Exercicios3.Exercicio03;

public class BancoMain {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaPoupanca(1000.00, "12345678");
        conta1.depositar(500.00);

        conta1.exibeConta();

    }
}
