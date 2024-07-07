package Curso02.Exercicios.Exercicios1.Exercicio04;

import java.time.LocalDate;


public class Carro {
    String modelo;
    String cor;
    int ano;
    int idadeCarro = 0;

    void exibirCarro() {
        System.out.println(STR."O carro é um \{modelo} com a cor \{cor}");
        atualizarIdade();
    }

    public void atualizarIdade() {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        idadeCarro = anoAtual - ano;
        System.out.println(STR."O carro tem \{idadeCarro} anos");
    }



}
