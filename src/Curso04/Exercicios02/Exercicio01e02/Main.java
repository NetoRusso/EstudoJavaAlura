package Curso04.Exercicios02.Exercicio01e02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        String jsonPessoa = """
                {
                    "nome": "Milena",
                    "idade": 30,
                    "cidade": "Uberlândia"
                }
                """;

        String jsonPessoa2 = """
                {
                    "nome": "Neto Russo",
                    "idade": 35
                }
                """;


//        Gson gson = new Gson(); Exercicio 01
        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(pessoa);

        Pessoa pessoa2 = gson.fromJson(jsonPessoa2, Pessoa.class);
        System.out.println(pessoa2);

    }
}
