package Curso02.Exercicios.Exercicios4.Exercicio06;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Mouse", 69);
        Servico servico = new Servico("Web Design", 230);

        DecimalFormat formato = new DecimalFormat("0.00");

        System.out.println("Produto: " +  produto.getNomeProduto() + "🖱️");
        System.out.println("Preco R$: " + produto.getPreco() + "💸");
        System.out.println("Desconto: 12%");
        System.out.println("Na compra de 5 " + produto.getNomeProduto() + " você irá pagar R$ " + formato.format(produto.precoFinal(5, 12)) + "💸");


        System.out.println("\n\n");

        System.out.println("Serviço: " + servico.getNomeServico() + "📡");
        System.out.println("Preco por hora R$: " + servico.getPrecoPorHora() + "💸");
        System.out.println("Desconto: 5%");
        System.out.println("Para realizar o serviço de " + servico.getNomeServico() + " vai precisar de 15 horas de trabalho 🤓 o valor final ser de R$ " + formato.format(servico.precoFinal(15, 5)) + "💸");
    }
}
