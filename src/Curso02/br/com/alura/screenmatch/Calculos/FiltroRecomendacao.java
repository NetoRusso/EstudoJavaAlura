package Curso02.br.com.alura.screenmatch.Calculos;

public class FiltroRecomendacao {


    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("O Titulo Está entre os preferidos do momento!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque em sua lista para assistir depois!");
        }

    }

}
