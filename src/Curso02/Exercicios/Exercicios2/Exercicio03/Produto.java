package Curso02.Exercicios.Exercicios2.Exercicio03;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    void darDesconto(double desconto) {
        double precoFinal = preco * (1 - (desconto/100));
        System.out.println(STR."Só hoje o \{this.nome} está em promoção de R$\{this.preco} com \{desconto}% de desconto, saindo por apenas R$\{precoFinal}.");
    }
}
