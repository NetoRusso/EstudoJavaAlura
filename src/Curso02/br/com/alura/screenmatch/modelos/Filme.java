package Curso02.br.com.alura.screenmatch.modelos;

import Curso02.br.com.alura.screenmatch.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDeLancamento, String diretor) {
        super(nome, anoDeLancamento);
        this.diretor = diretor;
    }


    public String getDiretor() {
        return diretor;
    }



    @Override
    public int getClassificacao() {
        return (int) pegaAMedia()/2;
    }

    @Override
    public String toString() {
        return "Filme : " + this.getNome() + " (" + this.getAnoDeLancamento() + ").";
    }
}
