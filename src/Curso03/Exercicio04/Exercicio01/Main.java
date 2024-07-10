package Curso03.Exercicio04.Exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(17);
        lista.add(41);
        lista.add(27);
        lista.add(3);

        System.out.println(lista.toString());

        Collections.sort(lista);

        System.out.println(lista.toString());

    }
}
