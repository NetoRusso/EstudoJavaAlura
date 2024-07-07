package Curso01JavaComOrientacaoAObjetos;

public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("O clássico que todo mundo ama!");
        }

        if (incluidoNoPlano || tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado, Boa diversão!");
        } else {
            System.out.println("Filme não liberado, esse filme não está disponível no seu plano.");

        }
    }}
