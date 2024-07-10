package Curso02.br.com.alura.screenmatch.principal;


import Curso02.br.com.alura.screenmatch.modelos.ErroDeConversaoDeAnoException;
import Curso02.br.com.alura.screenmatch.modelos.Titulo;
import Curso02.br.com.alura.screenmatch.modelos.TitulosOMDb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner userInput = new Scanner(System.in);

        String busca = "";

        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();



        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite o nome do filme: ");
            busca = userInput.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String chave = "b5cc8c99";
            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + chave;

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());


                String json = response.body();
                System.out.println(json);



                TitulosOMDb meuTituloOMDb = gson.fromJson(json, TitulosOMDb.class);
                System.out.println(meuTituloOMDb);


                Titulo meuTitulo = new Titulo(meuTituloOMDb);
                System.out.println("Titulo jaá convertido: ");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Aconteceu um erro, verifique o endereço de busca: ");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa encerrou corretamente!");


        userInput.close();


    }
}
