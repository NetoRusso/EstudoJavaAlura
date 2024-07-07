package Curso02.Exercicios.Exercicios2.Exercicio05;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrarDados() {
        System.out.println(STR."O livro \{this.titulo} foi escrito por \{this.autor}.");
    }
}
