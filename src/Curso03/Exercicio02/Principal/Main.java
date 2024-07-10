package Curso03.Exercicio02.Principal;

import Curso03.Exercicio02.Modelos.Produto;
import Curso03.Exercicio02.Modelos.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Caixa de Limão", 10.00, 10);
        Produto produto2 = new Produto("Caixa de Laranja", 16.89, 12);
        Produto produto3 = new Produto("Caixa de Banana", 5.00, 5);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Produtos da loja:");
        System.out.println("Estamos com o total de " + listaDeProdutos.size() + " produtos a venda");

        System.out.println(listaDeProdutos);

        System.out.println("\n");

        var produto4 = new ProdutoPerecivel("Caixa de Manga", 8.00, 7, "3 dias");
        var produto5 = new ProdutoPerecivel("Caixa de Uva", 13.47, 17, "2 semanas");
        var produto6 = new ProdutoPerecivel("Caixa de Melancia", 12.00, 10, "1 mês");

        listaDeProdutos.add(produto4);
        listaDeProdutos.add(produto5);
        listaDeProdutos.add(produto6);

        ArrayList<Produto> listaDeProdutosPereciveis = new ArrayList<>();
        listaDeProdutosPereciveis.add(produto4);
        listaDeProdutosPereciveis.add(produto5);
        listaDeProdutosPereciveis.add(produto6);

        System.out.println("Produtos pereciveis da loja:");
        System.out.println("Estamos com o total de " + listaDeProdutosPereciveis.size() + " produtos pereciveis a venda");

        System.out.println(listaDeProdutosPereciveis);

        for (Produto produto : listaDeProdutosPereciveis) {
            System.out.println(produto);
            System.out.println("Preco total: " + produto.getPreco() * produto.getQuantidade());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("\n");
        }
    }

}
