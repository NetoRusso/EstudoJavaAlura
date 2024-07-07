package Curso02.Exercicios.Exercicios3.Exercicio01;

public class ConcessionariaMain {
    public static void main(String[] args) {
        Carro esportivo = new ModeloCarro("Ferrari", "F40", 2023, 100000);

        esportivo.exibeCarro();
        esportivo.calcularPreco();
        esportivo.exibeCarro();

        System.out.println("**********************************************************************");


        Carro sedan = new ModeloCarro("Honda", "Civic", 2020, 70000);
        sedan.exibeCarro();
        sedan.calcularPreco();
        sedan.exibeCarro();

        System.out.println("**********************************************************************");

    }
}
