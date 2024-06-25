public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: The Matrix");

        int anoDeLancamento = 2000;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double notaMedia = (9.8 + 6.3 + notaDoFilme) / 3;
        System.out.println("Nota média do filme: " + notaMedia);

        // textBox utiliza 3 aspas """ """  implementado na versão 15 do JAVA

        String sinopse;
        sinopse = """
                Filme de ficção científica e ação,
                 com o ator Keanun Reavers 
                 lançado no ano """ + anoDeLancamento;


        System.out.println(sinopse);


//        equalsIgnoreCase() é utilizado para comparar strings sem diferenciar maiúsculas e minúsculas
//        equals() é utilizado para comparar strings com diferenciar maiúsculas e minúsculas

        /*Uma das maneiras mais comuns de se formatar textos em Java é utilizando o método format(), da classe String.
        Esse método permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere %
        seguido de uma letra que indica o tipo de dado que será inserido no placeholder.
                Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e %f
        indica um valor de ponto flutuante. Vamos ver um exemplo:*/

//        String nome = "Neto";
//        int idade = 35;
//        double valor = 55.9999;
//        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais.", nome, idade, valor));


        int classificacao = (int) (notaMedia/2);

        System.out.println("Classificação: " + classificacao);

    }


}
