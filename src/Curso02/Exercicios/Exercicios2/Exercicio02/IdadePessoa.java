package Curso02.Exercicios.Exercicios2.Exercicio02;

import java.time.LocalDate;

public class IdadePessoa {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void maiorIdade() {
        if (this.idade < 18) {
            System.out.println("A " + this.nome + " é menor de idade.");
        } else  {
            System.out.println(STR."A \{nome} é maior de idade.");
        }
    }

    void mostrarAnoNascimento() {
        LocalDate hoje = LocalDate.now();
        int anoHoje = hoje.getYear();
        int anoNascimento = anoHoje - this.idade;
        System.out.println(STR."O ano de nascimento é \{anoNascimento}.");
    }
}
