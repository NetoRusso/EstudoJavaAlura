package Curso04.Exercicios04.Exercicio02e03;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Titulo {
    private static String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public static void main(String[] args) {

        Titulo titulo = new Titulo("Chuck", 2007, 23);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(titulo);
        System.out.println(json);
    }

}
