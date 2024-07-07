package Curso02.Exercicios.Exercicios4.Exercicio01;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();

        DecimalFormat formato = new DecimalFormat("0.00");

        System.out.println("Valor em Real de 100 dols é : R$" + formato.format(conversor.converterDolarParaReal(100.0)));
        System.out.println("Valor em Dolar de 100 reais é : $" + formato.format(conversor.converterRealParaDolar(100.0)));
    }
}
