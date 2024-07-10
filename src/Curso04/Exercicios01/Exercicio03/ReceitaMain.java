package Curso04.Exercicios01.Exercicio03;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ReceitaMain {
    public static void main(String[] args) throws IOException, InterruptedException {

        //        www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata

        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite o nome da receita: ");
        var receita = userInput.nextLine();
        String url = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita.replace(" ", "+");



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
