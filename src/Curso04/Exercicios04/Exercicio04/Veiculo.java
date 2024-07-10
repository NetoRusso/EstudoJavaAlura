package Curso04.Exercicios04.Exercicio04;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Veiculo {
    private String nome;
    private String modelo;
    private int anoDeFabricacao;
    private double preco;

    public Veiculo(String nome, String modelo, int anoDeFabricacao, double preco) {
        this.nome = nome;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.preco = preco;
    }

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Ford", "Focus", 2020, 10000);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(veiculo);
        System.out.println(json);

    }
}
