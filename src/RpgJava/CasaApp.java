package RpgJava;



public class CasaApp {
    public static void main(String[] args) {
        Comodo escritorio = new Comodo();
        escritorio.nome = "Escritório";
        escritorio.cor = "Verde";
        escritorio.funcao = "Trabalhar e Estudar e de vez em quando Jogar";
        escritorio.areaMolhada = false;

        Comodo banheiro = new Comodo();
        banheiro.nome = "Banheiro";
        banheiro.cor = "Branco";
        banheiro.funcao = "Higiêne pessoal";
        banheiro.areaMolhada = true;

        Comodo salaDeTv = new Comodo();
        salaDeTv.nome = "Sala de Tv";
        salaDeTv.cor = "Branco";
        salaDeTv.funcao = "Assistr Tv e socializar";
        salaDeTv.areaMolhada = false;

        Comodo quarto = new Comodo();
        quarto.nome = "Quarto";
        quarto.cor = "Azul Escuro";
        quarto.funcao = "Dormir e fazer coisas divertidas(😈) ";
        quarto.areaMolhada = false;

        Comodo salaDeEstar = new Comodo();
        salaDeEstar.nome = "Sala De Estar";
        salaDeEstar.cor = "Amarelo";
        salaDeEstar.funcao = "Ler, socializar e descansar";
        salaDeEstar.areaMolhada = false;

        Comodo cozinha = new Comodo();
        cozinha.nome = "Cozinha";
        cozinha.cor = "Branco";
        cozinha.funcao = "Comer e cozinhar";
        cozinha.areaMolhada = true;

        Comodo banheiroSuite = new Comodo();
        banheiroSuite.nome = "Banheiro Suite";
        banheiroSuite.cor = "Branco";
        banheiroSuite.funcao = "Higiêne pessoal";
        banheiroSuite.areaMolhada = true;

        Comodo Garagem = new Comodo();
        Garagem.nome = "Garagem";
        Garagem.cor = "Branco";
        Garagem.funcao = "Entrada da casa e Guardar o Carro";
        Garagem.areaMolhada = true;

    }
}
