package Curso02.Exercicios.Exercicios3.Exercicio03;

public class ContaCorrente extends ContaBancaria {
    private String tipoDeConta = "Conta corrente";

    public ContaCorrente(double saldo, String numeroConta) {
        super(saldo, numeroConta);
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    @Override
    public void exibeTipoDeConta(){
        System.out.println("Conta do tipo Corrente");
    }
}
