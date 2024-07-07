package Curso02.Exercicios.Exercicios3.Exercicio02;

public class Animal {
    private String nome;
    private String especie;
    private String habitat;

    public Animal(String nome, String especie, String habitat) {
        this.nome = nome;
        this.especie = especie;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    public void fazerBarulho(){

        System.out.println(STR."O \{getNome()} esta fazendo um barulho");
    }


    public void exibeAnimal(){
        System.out.println("Nome: " + getNome());
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Habitat: " + getHabitat());
        fazerBarulho();
        System.out.println("**********************************");
    }

}
