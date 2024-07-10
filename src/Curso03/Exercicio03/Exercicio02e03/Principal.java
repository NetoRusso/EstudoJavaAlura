package Curso03.Exercicio03.Exercicio02e03;

public class Principal {
    public static void main(String[] args) {
        Animal animal = new Cachorro("Francis Bacon", "Au Au");

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println(animal.getNome());

        }else {
            System.out.println("Não é cachorro");
        }
//
    }
}
