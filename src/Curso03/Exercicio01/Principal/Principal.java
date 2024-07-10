package Curso03.Exercicio01.Principal;

import Curso03.Exercicio01.Modelos.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Milena Russo");
        pessoa1.setIdade(30);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Neto Russo");
        pessoa2.setIdade(35);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Tiago Ariça");
        pessoa3.setIdade(33);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeiro pessoa: " + listaDePessoas.get(0));
        System.out.println("Lista completa: " + listaDePessoas);
    }
}
