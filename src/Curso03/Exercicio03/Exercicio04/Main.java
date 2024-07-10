package Curso03.Exercicio03.Exercicio04;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> carrinho = new ArrayList<>();

        Produto produto1 = new Produto("Notebook", 6500);
        Produto produto2 = new Produto("Teclado", 350);
        Produto produto3 = new Produto("Mouse", 99.90);

        carrinho.add(produto1);
        carrinho.add(produto2);
        carrinho.add(produto3);

        var somaTotal = 0.00;

        for (Produto item : carrinho) {
            somaTotal += item.getPreco();
        }

        DecimalFormat formato = new DecimalFormat("0,00");

        System.out.println("Soma total: R$ " + formato.format(somaTotal));
        System.out.println("O ticket méido da suas compras é : R$ " + formato.format(somaTotal/carrinho.size()));
    }
}
