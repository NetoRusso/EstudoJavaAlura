package Curso02.Exercicios.Exercicios3.Exercicio03;

public class ContaBancaria {
    private double saldo;
    private String numeroConta;

    public ContaBancaria(double saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor){
        setSaldo(getSaldo() - valor);
    }

    public void exibeTipoDeConta(){
        System.out.println("Conta do tipo Geral");
    }

    public void exibeConta(){
        System.out.println("**********************************");
        System.out.println("Número da conta: " + getNumeroConta());
        exibeTipoDeConta();
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println("**********************************");
    }




}
