package Curso02.br.com.alura.screenmatch.modelos;

import Curso02.br.com.alura.screenmatch.Calculos.Classificavel;

public class Episodio implements Classificavel {
    private int episodioNumero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getEpisodioNumero() {
        return episodioNumero;
    }

    public void setEpisodioNumero(int episodioNumero) {
        this.episodioNumero = episodioNumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        }else {
            return 2;
        }
    }
}
