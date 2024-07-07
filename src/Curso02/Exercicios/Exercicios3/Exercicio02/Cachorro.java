package Curso02.Exercicios.Exercicios3.Exercicio02;

public class Cachorro extends Animal {
   private String som;

    public Cachorro(String nome, String especie, String habitat, String som) {
        super(nome, especie, habitat);
        this.som = som;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public void fazerBarulho() {
        System.out.println(STR."O \{getNome()} esta fazendo um barulho que soa assim \{getSom()}");
    }
}
