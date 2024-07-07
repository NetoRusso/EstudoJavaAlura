package Curso02.Exercicios.Exercicios4.Exercicio02;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public double calcularArea(double largura, double comprimento) {
        double area = largura * comprimento;
        return area;
    }

    @Override
    public double calcularPerímetro(double largura, double comprimento) {
        double perímetro = 2 * (largura + comprimento);
        return perímetro;
    }

}
