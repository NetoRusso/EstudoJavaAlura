package Curso02.Exercicios.Exercicios4.Exercicio05;

public class Livro extends Itens implements Calculavel {

    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public double calcularPrecoFinal(double desconto) {
        double precoFinal = getPreco() - (getPreco() * desconto / 100);
        return precoFinal;
    }
}
