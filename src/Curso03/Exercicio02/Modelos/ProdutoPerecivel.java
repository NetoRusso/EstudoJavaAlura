package Curso03.Exercicio02.Modelos;

public class ProdutoPerecivel extends Produto {
    private String tempoDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String tempoDeValidade) {
        super(nome, preco, quantidade);
        this.tempoDeValidade = tempoDeValidade;
    }
}
