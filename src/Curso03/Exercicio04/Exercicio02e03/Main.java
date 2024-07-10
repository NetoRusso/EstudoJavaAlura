package Curso03.Exercicio04.Exercicio02;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Bora codar");
        Titulo titulo2 = new Titulo("Vamos Jogar um TFT?");
        Titulo titulo3 = new Titulo("O que é Java?");
        Titulo titulo4 = new Titulo("Agora Vai carai!");

        List<Titulo> lista = new LinkedList<>();
        lista.add(titulo1);
        lista.add(titulo2);
        lista.add(titulo3);
        lista.add(titulo4);

        System.out.println("Lista padrão :" + lista);

        Collections.sort(lista);

        System.out.println("Lista ordenada :" + lista);


    }
}
