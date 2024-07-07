package Curso02.Exercicios.Exercicios1.Exercicio05;

import java.time.LocalDate;

public class Aluno {
    String nome;
    int idade = 0;
    int anonascimento;


    void exibirAluno() {
        System.out.println(STR."Nome: \{nome}");
        atualizarIdade();

    }

    void atualizarIdade() {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        idade = anoAtual - anonascimento;
        System.out.println(STR."Idade: \{idade} anos");
    }

}
