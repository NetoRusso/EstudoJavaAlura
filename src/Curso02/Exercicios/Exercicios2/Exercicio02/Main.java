package Curso02.Exercicios.Exercicios2.Exercicio02;

public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Douglas Ferreira");
        pessoa.setIdade(25);
        pessoa.maiorIdade();
        pessoa.mostrarAnoNascimento();


        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Neto Russo");
        pessoa2.setIdade(35);
        pessoa2.maiorIdade();
        pessoa2.mostrarAnoNascimento();
    }

}
