package Curso04.Exercicios01.Exercicio01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BibliotecaMain {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        var livro = userInput.nextLine();





        String chave = "AIzaSyAmWqBQRh5q9tz2HyUdJFwGd0r895tJhTk";
        String url = "https://www.googleapis.com/books/v1/volumes?q=" + livro.replace(" ", "+") + "&key=" + chave;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        userInput.close();

    }
}
