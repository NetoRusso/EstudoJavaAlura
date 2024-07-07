package Curso02.Exercicios.Exercicios1.Exercicio02;

public class Calculadora {

    void dobro(double numero) {
        double resultado = numero * 2;
        System.out.println("O dobro do numero " + numero + " é " + resultado);
    }

    void quadrado(double numero) {
        double resultado = numero * numero;
        System.out.println("O quadrado do numero " + numero + " é " + resultado);
    }

    void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A multiplicacao entre " + numero1 + " e " + numero2 + " é " + resultado);
    }

    void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        if (numero2 == 0) {
            System.out.println("Não é possível dividir por 0");
        }
        System.out.println("A divisao entre " + numero1 + " e " + numero2 + " é " + resultado);
    }

    void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma entre " + numero1 + " e " + numero2 + " é " + resultado);
    }

    void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A subtração entre " + numero1 + " e " + numero2 + " é " + resultado);
    }


}
