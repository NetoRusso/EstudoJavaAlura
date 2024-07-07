package Curso02.Exercicios.Exercicios3.Exercicio04;

public class TesteNumerosPrimosMain {
    public static void main(String[] args) {
        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        verificadorPrimo.verificarSeEhPrimo(2);
        verificadorPrimo.verificarSeEhPrimo(3);
        verificadorPrimo.verificarSeEhPrimo(4);
        verificadorPrimo.verificarSeEhPrimo(5);
        verificadorPrimo.verificarSeEhPrimo(6);
        verificadorPrimo.verificarSeEhPrimo(7);
        verificadorPrimo.verificarSeEhPrimo(8);
        verificadorPrimo.verificarSeEhPrimo(9);
        verificadorPrimo.verificarSeEhPrimo(10);

        GeradorPrimo geradorPrimo = new GeradorPrimo();

        geradorPrimo.gerarProximoPrimo(997);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(1000);
    }
}
