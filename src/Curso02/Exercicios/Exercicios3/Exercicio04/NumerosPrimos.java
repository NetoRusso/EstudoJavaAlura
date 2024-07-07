package Curso02.Exercicios.Exercicios3.Exercicio04;

public class NumerosPrimos {


    public boolean verificadorPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limiteSuperior) {
        System.out.println("Primos entre 0 e " + limiteSuperior + ":");
        for (int i = 2; i < limiteSuperior; i++) {
            if (verificadorPrimalidade(i)) {
                System.out.println(i + " - ");
            }
        }
        System.out.println();
    }

}
