package Curso02.br.com.alura.screenmatch.principal;

import Curso02.br.com.alura.screenmatch.modelos.Filme;
import Curso02.br.com.alura.screenmatch.modelos.Serie;
import Curso02.br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {

        var meuFilme = new Filme("Matrix", 1999, "Lana Wachowski e Lilly Wachowski");
        meuFilme.avaliaFilme(10);
        var meuFilme2 = new Filme("Matrix 2 Reloaded", 2003, "Lana Wachowski e Lilly Wachowski");
        meuFilme2.avaliaFilme(8);
        var meuFilme3 = new Filme("Matrix 3 Revolutions", 2003, "Lana Wachowski e Lilly Wachowski");
        meuFilme3.avaliaFilme(5);

        Filme f1 = meuFilme;

        var chuck = new Serie("Chuck", 2007);


        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(meuFilme3);
        lista.add(chuck);

        for (Titulo item : lista) {
            System.out.println("Titulo : " + item.getNome());
            if (item instanceof Filme filme  && filme.getClassificacao() > 2) {
                System.out.println("Classificação : " + filme.getClassificacao());
            }
        }

//        lista.forEach(System.out::println);

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Brad Pitt");
        buscaPorArtista.add("Angelina Jolie");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Ordenada : " +buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Ordenada A-Z : " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenada por ano de lançamento : " + lista);



    }
}
