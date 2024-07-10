package Curso04.Exercicios01.Exercicio02;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CotacaoMain {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                Qual a Cripto moeda que você deseja olhar o JSON?
                                
                1 - Bitcoin
                2 - Ethereum
                3 - Litecoin
                4 - Ripple
                                
                """);

        int opicao01 = userInput.nextInt();

        String cripto = "";
        String moeda = "";

        switch (opicao01) {
            case 1:
                cripto = "bitcoin";
                break;
            case 2:
               cripto = "ethereum";
                break;
            case 3:
                cripto = "litecoin";
                break;
            case 4:
                cripto = "ripple";
                break;
            default:
                System.out.println("Opição invalida");
                break;
        }


        System.out.println("""
                Qual a moeda comparativa ?
                1 - USD (Dolar)
                2 - EUR (Euro)
                3 - BRL (Real)
                """);
        int opicao02 = userInput.nextInt();

        switch (opicao02) {
            case 1:
                moeda = "USD";
                break;
            case 2:
                moeda = "EUR";
                break;
            case 3:
                moeda = "BRL";
                break;
            default:
                System.out.println("Opição invalida");
                break;
        }

//        https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&ids=bitcoin&x_cg_demo_api_key=CG-N9k6Fegncumj8NNyRYonCX6a

        var chave = "CG-N9k6Fegncumj8NNyRYonCX6a";
        String url = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=" + moeda + "&ids=" + cripto + "&x_cg_demo_api_key=" + chave;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(response.body());

        userInput.close();
    }
}
