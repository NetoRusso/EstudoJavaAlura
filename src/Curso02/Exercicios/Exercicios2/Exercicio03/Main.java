package Curso02.Exercicios.Exercicios2.Exercicio03;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(3600.00);

        produto.darDesconto(10);

    }
}
