package Curso03.Exercicio03.Exercicio06;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AgenciaMain {
    public static void main(String[] args) {

        DecimalFormat formato = new DecimalFormat("0.00");

        var conta1 = new ContaBancaria(123456789, 1000);
        var conta2 = new ContaBancaria(234567890, 2000);
        var conta3 = new ContaBancaria(345678901, 3000);

        ArrayList<ContaBancaria> carteiraContas = new ArrayList<>();
        carteiraContas.add(conta1);
        carteiraContas.add(conta2);
        carteiraContas.add(conta3);

        ContaBancaria contaMaiorSaldo  = carteiraContas.get(0);
        for (ContaBancaria conta : carteiraContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com maior saldo : " + contaMaiorSaldo.getNumeroConta() + "Com o saldo de : R$ " + formato.format(contaMaiorSaldo.getSaldo()));
    }
}
