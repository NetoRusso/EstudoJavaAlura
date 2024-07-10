package Curso03.Exercicio04.Exercicio04e05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");

        List<Integer> lista2 = new LinkedList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);


        System.out.println(lista);
        System.out.println(lista2);

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.addAll(lista);

        System.out.println(listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("F");
        listaPolimorfica.add("G");
        listaPolimorfica.add("H");
        listaPolimorfica.add("I");
        listaPolimorfica.add("J");

        System.out.println(listaPolimorfica);


    }
}
