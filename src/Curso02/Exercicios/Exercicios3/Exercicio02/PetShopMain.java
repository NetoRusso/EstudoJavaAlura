package Curso02.Exercicios.Exercicios3.Exercicio02;

public class PetShopMain {
    public static void main(String[] args) {
        Animal francis = new Cachorro("Francis Bacon", "Cachorro", "Quintal", "Au au Au");
        francis.exibeAnimal();

        Animal felix = new Gato("Felix", "Gato", "Dentro de casa", "Miauuuu!");
        felix.exibeAnimal();
    }
}
