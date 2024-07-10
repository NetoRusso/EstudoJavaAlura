package Curso02.br.com.alura.screenmatch.principal;

import Curso02.br.com.alura.screenmatch.Calculos.CalculadoraDeTempo;
import Curso02.br.com.alura.screenmatch.Calculos.FiltroRecomendacao;
import Curso02.br.com.alura.screenmatch.modelos.Episodio;
import Curso02.br.com.alura.screenmatch.modelos.Filme;
import Curso02.br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Matrix", 1999, "Lana Wachowski e Lilly Wachowski");
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(136);
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(9);
        meuFilme.avaliaFilme(10);
        meuFilme.avaliaFilme(7);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        meuFilme.exibeFichaTecnica();
        System.out.println("\n");

        Serie chuck = new Serie("Chuck", 2007);
        chuck.setIncluidoNoPlano(true);
        chuck.setMinutosPorEpisodio(40);
        chuck.setEpisodiosPorTemporada(18);
        chuck.setTemporadas(5);
        chuck.setAtiva(false);

        chuck.exibeFichaTecnica();
        System.out.println("Duração para maratonar Chuck: " + chuck.getDuracaoEmMinutos() + " Minutos");

        System.out.println("\n");

        CalculadoraDeTempo calculo = new CalculadoraDeTempo();
        calculo.inclui(meuFilme);

        System.out.println("Tempo total: " + calculo.getTempoTotal() + " minutos o que totaliza " + (calculo.getTempoTotal()/60) + " horas" );

        System.out.println("\n");

        Filme meuFilme2 = new Filme("Matrix 2 Reloaded", 2003, "Lana Wachowski e Lilly Wachowski");
        meuFilme2.setIncluidoNoPlano(true);
        meuFilme2.setDuracaoEmMinutos(138);

        calculo.inclui(meuFilme2);
        System.out.println("Tempo total: " + calculo.getTempoTotal() + " minutos o que totaliza " + (calculo.getTempoTotal()/60) + " horas" );

        calculo.inclui(chuck);
        System.out.println("Tempo total: " + calculo.getTempoTotal() + " minutos o que totaliza " + (calculo.getTempoTotal()/60) + " horas" );

        System.out.println("\n");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setEpisodioNumero(1);
        episodio.setNome("Episódio Piloto");
        episodio.setSerie(chuck);
        episodio.setTotalVisualizacoes(100);
        filtro.filtra(episodio);

        var meuFilme3 = new Filme("Matrix 3 Revolutions", 2003, "Lana Wachowski e Lilly Wachowski");
        meuFilme3.setDuracaoEmMinutos(129);

        meuFilme3.avaliaFilme(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme3);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());

        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

        System.out.println(listaDeFilmes);




    }
}
