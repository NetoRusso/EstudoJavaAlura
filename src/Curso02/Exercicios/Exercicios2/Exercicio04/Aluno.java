package Curso02.Exercicios.Exercicios2.Exercicio04;

public class Aluno {
    private String nome;
    private double somaTotalNotas = 0;
    private int quantidadesDeNotas = 0;
    private double mediaNotas = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        somaTotalNotas += nota;
        quantidadesDeNotas++;
        mediaNotas = somaTotalNotas / quantidadesDeNotas;
        System.out.println(STR."O total de notas do aluno(a) \{this.nome} é \{nota}.");
        System.out.println(STR."A média de notas é \{mediaNotas}.");
    }

    public void mostrarMediaNotas() {
        System.out.println(STR."A média de notas do aluno(a) \{this.nome} é \{mediaNotas}.");
    }

    public void mostrarTotalNotas() {
        System.out.println(STR."O total de notas do aluno(a) \{this.nome} é \{somaTotalNotas}.");
    }
}
