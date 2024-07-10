package Curso04.Exercicios02.Exercicio03;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        String jsonLivro = """
                {
                    "titulo": "O que é Java",
                    "autor": "Milena",
                    "editora": {
                        "nome": "Alura",
                        "cidade": "São Paulo"
                    }
                }
                """;

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);

    }
}
