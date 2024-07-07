package Curso02.Exercicios.Exercicios4.Exercicio06;

public class Servico implements Vendavel {
    private String nomeServico;
    private double precoPorHora;

    public Servico(String nomeServico, double precoPorHora) {
        this.nomeServico = nomeServico;
        this.precoPorHora = precoPorHora;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    @Override
    public double precoFinal(int quantidade, double desconto) {
        double precoFinal = quantidade * (precoPorHora - (precoPorHora * desconto / 100));
        return precoFinal;
    }
}
