package Curso02.br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TitulosOMDb tituloOMDb) {
        this.nome = tituloOMDb.title();

        if(tituloOMDb.year().length() > 4){
            try {
                this.anoDeLancamento = Integer.valueOf(tituloOMDb.year().substring(0, 4));
            }catch (NumberFormatException e){
                e.printStackTrace();
            }catch (ErroDeConversaoDeAnoException e) {
                throw new ErroDeConversaoDeAnoException("Não conseguiu converter o ano de lançamento, o ano tem mais de 04 dígitos");
            }
        }

        String [] tempo = tituloOMDb.runtime().split(" ");

        this.duracaoEmMinutos = Integer.parseInt(tempo[0]);
    }


    //getters

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Setters


    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Métodos

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        if (incluidoNoPlano) {
            System.out.println("Incluído no plano");
        } else {
            System.out.println("Não incluído no plano");
        }

        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Média: " + pegaAMedia());

    }

    public void avaliaFilme(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaAMedia() {
        double mediaDasNotas = ((somaDasAvaliacoes / totalDeAvaliacoes));
        return mediaDasNotas;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return
                "Nome: " + nome + ", Lançamento: " + anoDeLancamento +  ", duração: " + duracaoEmMinutos + " mins";
    }
}
