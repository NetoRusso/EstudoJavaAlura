package Curso04.Exercicios02.Exercicio01;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        String jsonPessoa = """
                {
                    "nome": "Milena",
                    "idade": 30,
                    "cidade": "Uberlândia"
                }
                """;


        Gson gson = new Gson();

        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(pessoa);

    }
}
