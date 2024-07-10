package Curso03.Exercicio03.Exercicio01;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Jose");
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Maria");
        nomes.add("Paulo");

        nomes.forEach(System.out::println);


        System.out.println(nomes.contains("Joao"));
        System.out.println(nomes.contains("Maria"));

    }
}
