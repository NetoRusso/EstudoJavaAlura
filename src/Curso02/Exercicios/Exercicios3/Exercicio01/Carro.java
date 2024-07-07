package Curso02.Exercicios.Exercicios3.Exercicio01;

import java.time.LocalDate;

public class Carro {
    private String nome;
    private String modelo;
    private int ano;
    private double preco;

    public Carro(String nome, String modelo, int ano, double preco) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibeCarro(){
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço:  R$" + preco);
    }

    public void calcularPreco(){
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        if (this.ano == anoAtual){
            preco = getPreco();
        } else if(anoAtual - this.ano == 1){
            preco = getPreco() * 0.9;
        } else if(anoAtual - this.ano == 2){
            preco = getPreco() * 0.8;
        } else if(anoAtual - this.ano == 3){
            preco = getPreco() * 0.7;
        } else if(anoAtual - this.ano > 3){
            System.out.println(STR."O carro \{getNome()} já saiu de linha");
        }
    }
}
