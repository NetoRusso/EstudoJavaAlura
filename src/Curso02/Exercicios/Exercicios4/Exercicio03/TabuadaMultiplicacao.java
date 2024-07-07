package Curso02.Exercicios.Exercicios4.Exercicio03;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("* * * * * * * * * * * * * * * * * * * * *");

        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
            System.out.println(STR."\{i} x \{numero} = \{numero * i} 🤓");
            } else {
                System.out.println(STR."\{i} x \{numero} = \{numero * i} 🧮");
            }
        }
        System.out.println("Tabuada Finalizada 👓");
        System.out.println("* * * * * * * * * * * * * * * * * * * * *");
    }

}
