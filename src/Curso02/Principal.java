package Curso02;

import Curso02.br.com.alura.screenmatch.Calculos.CalculadoraDeTempo;
import Curso02.br.com.alura.screenmatch.Calculos.FiltroRecomendacao;
import Curso02.br.com.alura.screenmatch.modelos.Episodio;
import Curso02.br.com.alura.screenmatch.modelos.Filme;
import Curso02.br.com.alura.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(136);
        meuFilme.setDiretor("Lana Wachowski e Lilly Wachowski");
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(9);
        meuFilme.avaliaFilme(10);
        meuFilme.avaliaFilme(7);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        meuFilme.exibeFichaTecnica();

        System.out.println("""
                
                *********************************************************************
                """);

        Serie chuck = new Serie();
        chuck.setNome("Chuck");
        chuck.setAnoDeLancamento(2007);
        chuck.setIncluidoNoPlano(true);
        chuck.setMinutosPorEpisodio(40);
        chuck.setEpisodiosPorTemporada(18);
        chuck.setTemporadas(5);
        chuck.setAtiva(false);

        chuck.exibeFichaTecnica();
        System.out.println("Duração para maratonar Chuck: " + chuck.getDuracaoEmMinutos() + " Minutos");


        CalculadoraDeTempo calculo = new CalculadoraDeTempo();
        calculo.inclui(meuFilme);

        System.out.println("Tempo total: " + calculo.getTempoTotal() + " minutos o que totaliza " + (calculo.getTempoTotal()/60) + " horas" );

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Matrix 2 Reloaded");
        meuFilme2.setAnoDeLancamento(2003);
        meuFilme2.setIncluidoNoPlano(true);
        meuFilme2.setDuracaoEmMinutos(138);
        meuFilme2.setDiretor("Lana Wachowski e Lilly Wachowski");

        calculo.inclui(meuFilme2);
        System.out.println("Tempo total: " + calculo.getTempoTotal() + " minutos o que totaliza " + (calculo.getTempoTotal()/60) + " horas" );

        calculo.inclui(chuck);
        System.out.println("Tempo total: " + calculo.getTempoTotal() + " minutos o que totaliza " + (calculo.getTempoTotal()/60) + " horas" );


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setEpisodioNumero(1);
        episodio.setNome("Episódio Piloto");
        episodio.setSerie(chuck);
        episodio.setTotalVisualizacoes(100);
        filtro.filtra(episodio);

    }
}
