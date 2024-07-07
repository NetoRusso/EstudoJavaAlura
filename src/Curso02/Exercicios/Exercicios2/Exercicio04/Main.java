package Curso02.Exercicios.Exercicios2.Exercicio04;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Joao Maluco");
        aluno.adicionarNota(8.5);
        aluno.adicionarNota(9.0);
        aluno.adicionarNota(7.5);
        aluno.adicionarNota(8.0);
        aluno.mostrarMediaNotas();
        aluno.mostrarTotalNotas();
    }
}
