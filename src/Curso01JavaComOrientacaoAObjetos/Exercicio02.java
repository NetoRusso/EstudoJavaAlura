package Curso01JavaComOrientacaoAObjetos;/*Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar ovalores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.*/

/*Crie um programa que realize a média de duas notas decimais e exiba o resultado.*/

/*Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.*/

/*Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.*/

/*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/

/*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/

/*Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.*/


public class Exercicio02 {
    public static void main(String[] args) {

        //Temperatura
        /*
        Scanner temperatura = new Scanner(System.in);
        System.out.println("Qual a temperatura em Celsius?");
        double temperaturaCelsius = temperatura.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
        */

        //01 - Nota Media
        /*
        double nota1 = 8.1;
        double nota2 = 6.3;
        double notaMedia = (nota1 + nota2)/2;
        System.out.println("Nota media: " + notaMedia);
        */

        //02 - Conversor de Dinheiro
        /*
        double variavel1 = 6.3;
        int variavel2 = 5;

        int soma = (int) variavel1 + (int) variavel2;
        System.out.println("Curso01JavaComOrientacaoAObjetos.Soma: " + soma);
        */

        //03 - concatena Palavra
        /*
        char letra = 's';
        String palavra = "programa";
        String mensagem = palavra + letra;
        System.out.println(mensagem);
        */

        //04 - compra
        /*
        double precoProduto = 10.99;
        int quantidade = 2;
        double precoTotal = precoProduto * quantidade;
        System.out.println("Preco total: " + precoTotal);
        */

        //05 - conversor moeda
        /*
        double valorEmDolares = 2300.00;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.println("Valor em reais: " + valorEmReais);
        */

        //06 - desconto
        /*
        double precoOriginal = 10.90;
        double percentualDesconto = 10;
        double precoComDesconto = precoOriginal - ((precoOriginal * percentualDesconto) / 100);
        System.out.println("Preco com desconto: " + precoComDesconto);
        */
    }
}
