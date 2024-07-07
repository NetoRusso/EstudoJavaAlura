package Curso02.Exercicios.Exercicios3.Exercicio03;

public class ContaPoupanca extends ContaBancaria {
    private String tipoDeConta = "Conta polpanca";

    public ContaPoupanca(double saldo, String numeroConta) {
        super(saldo, numeroConta);
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    @Override
    public void exibeTipoDeConta(){
        System.out.println("Conta do tipo Polpanca");
    }


}
