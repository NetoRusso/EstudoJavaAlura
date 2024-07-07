package Curso02.Exercicios.Exercicios4.Exercicio06;

public class Produto implements Vendavel {
    private String nomeProduto;
    private double preco;

    public Produto(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double precoFinal(int quantidade, double desconto) {
        double precoFinal = quantidade * (preco - (preco * desconto / 100));
        return precoFinal;
    }
}
