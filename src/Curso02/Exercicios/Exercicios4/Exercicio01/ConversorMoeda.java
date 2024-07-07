package Curso02.Exercicios.Exercicios4.Exercicio01;

public class ConversorMoeda implements ConversaoFinanceira {


    @Override
    public double converterDolarParaReal(double valorDolar) {
        double valorReal = valorDolar * 5.0;
        return valorReal;
    }

    @Override
    public double converterRealParaDolar(double valorReal) {
        double valorDolar = valorReal / 5.0;
        return valorDolar;
    }


}
