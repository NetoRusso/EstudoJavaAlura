package Curso02.Exercicios.Exercicios2.Exercicio01;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo = 100.00;
    public String titular;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }


    public void mostrarDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero da conta: " + numeroDaConta);
        System.out.println("Saldo: " + saldo);
    }

}
