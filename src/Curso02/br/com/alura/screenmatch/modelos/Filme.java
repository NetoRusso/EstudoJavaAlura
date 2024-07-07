package Curso02.br.com.alura.screenmatch.modelos;

import Curso02.br.com.alura.screenmatch.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) pegaAMedia()/2;
    }
}
