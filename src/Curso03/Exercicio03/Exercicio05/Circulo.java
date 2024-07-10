package Curso03.Exercicio03.Exercicio05;


public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }



    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}
