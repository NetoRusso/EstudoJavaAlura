package Curso02.Exercicios.Exercicios4.Exercicio05;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Livro de Java", 100, "Douglas Crockford");
        ProdutoFisico produtoFisico = new ProdutoFisico("mouse", 69);

        DecimalFormat formato = new DecimalFormat("0.00");

        System.out.println("Livro: " + livro.getNome() + "📖");
        System.out.println("Preco R$: " + formato.format(livro.getPreco()) + "💸");
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Desconto: 17%");
        System.out.println("Preco final: " + formato.format(livro.calcularPrecoFinal(17)) + "💸");

        System.out.println("\n\n");

        System.out.println("Produto físico: " + produtoFisico.getNome() + "🖱️");
        System.out.println("Preco R$: " + formato.format(produtoFisico.getPreco()) + "💸");
        System.out.println("Desconto: 12%");
        System.out.println("Preco final R$: " + formato.format(produtoFisico.calcularPrecoFinal(12)) + "💸");


    }
}
