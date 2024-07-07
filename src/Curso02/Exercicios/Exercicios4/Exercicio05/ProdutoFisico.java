package Curso02.Exercicios.Exercicios4.Exercicio05;

public class ProdutoFisico extends Itens implements Calculavel {

    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal(double desconto) {
        double precoFinal = getPreco() - (getPreco() * desconto / 100);
        return precoFinal;
    }
}
