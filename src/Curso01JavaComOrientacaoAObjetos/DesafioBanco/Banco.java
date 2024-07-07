package Curso01JavaComOrientacaoAObjetos.DesafioBanco;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Banco {
    private static String nomeCliente = "";
    private static String senha = "";
    private static double saldo = 200.00;
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("""
                                
                💵 "Bem vindo ao BoraCodar Bank!" 💸
                                
                """
        );

        login();
        abrirConta();
        menuOperacional();

    }

    public static boolean verificacaoSenha(String senha, String verificacaoSenha, boolean verificacao) {
        int letra = 0;

        for (int i = 0; i < senha.length(); i++) {
            char n = senha.charAt(i);
            if (!Character.isDigit(n)) {
                letra++;
            }
        }

        if (verificacao) {
            return senha != verificacaoSenha;
        } else {
            return senha.length() < 6 || letra > 0;
        }
    }

    public static void login() {
        System.out.println("Digite o seu nome:  🙎");

        nomeCliente = userInput.nextLine();

        System.out.println("Digite a sua senha numérica de 6 dígitos:  🗝️");
        senha = userInput.nextLine();

        if (verificacaoSenha(senha, "", false)) {
            System.out.println("⛔ Senha inválida! ⛔");
            login();
        }
    }

    public static void abrirConta() {
        System.out.println("""
                               
                ✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨
                                               
                  Conta acessada com sucesso ! ✅
                   
                    Bem vindo(a) _""" + nomeCliente + """ 
                 
                 🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓🔓                   
                                
                 Dados da conta:
                 
                Nome do cliente:  _""" + nomeCliente + """
                                    
                                    
                Tipo de conta: Conta Corrente
                                    
                  
                🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟🌟  
                                """);
    }

    public static void depositarValor() {
        System.out.println("Digite o valor a ser depositado: 💵");

        double valor = userInput.nextDouble();
        saldo += valor;

        System.out.println("Depositando... Por favor aguarde. ⏱️");
        tempo(3000, () -> {
            System.out.println("""
                        💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵
                                                                                                 
                        Deposito realizado com sucesso! 💵
                                                                                                  
                        💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵
                                                            
                            """);
            menuCurto();
        });
    }

    public static void sacarValor() {


        System.out.println("Carregando o sistema de saque... Por favor aguarde. ⏱️");
        tempo(3000, () -> {
            System.out.println("Digite o valor a ser sacado: 💵, ou 0 para cancelar");
            double valor = userInput.nextDouble();
            userInput.nextLine();
            if (valor == 0) {
                System.out.println("Operação cancelada! ⛔");
                menuCurto();
            } else if (valor > saldo) {
                System.out.println("⛔ Saldo insuficiente! ⛔");
                tempo(2000, () -> {
                    System.out.println("Saldo atual: R$" + saldo);
                    tempo(1000, () -> sacarValor());
                });

            } else if (valor <= saldo && valor > 0) {
                System.out.println("Digite a sua senha de 6 dígitos para confirmar o valor a ser sacado: 🗝️");
                String senhaConfirmacao = userInput.nextLine();

                boolean senhaIgual = senhaConfirmacao.equals(senha);
                gerarSaque(senhaConfirmacao, valor, senhaIgual);
            }
        });
    }

    public static void gerarSaque(String senhaConfirmacao, double valor, boolean senhaIgual) {

        boolean confirmacao = verificacaoSenha(senhaConfirmacao, senha, false);
        if (!confirmacao && senhaIgual) {
            System.out.println("Sacar R$" + valor + "? digite 'S' para confirmar ou 'N' para cancelar");
            String aceitar = userInput.nextLine();
            System.out.println("Precione Enter para concluir a operação");
            userInput.nextLine();
            if (aceitar.toUpperCase().equals("S")) {
                saldo -= valor;
                System.out.println("Operação realizada com sucesso! ✅");

                tempo(2000, () -> menuCurto());
//                menuCurto();
            } else {
                System.out.println("Operação cancelada! ⛔");
                tempo(2000, () -> menuCurto());
            }

        } else {
            System.out.println("Senha incorreta! ⛔");
            sacarValor();
        }
    }

    public static void menuCurto() {

        System.out.println("""
                                    
                Opções:
                                                       
                1 - Voltar ao menu principal ◀️
                                                    
                2 - Encerrar acesso 🔐
                                                     
                🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦
                                    
                """);

        int opcao = userInput.nextInt();

        if (opcao < 1 || opcao > 2) {
            System.out.println("⛔ Opção inválida! ⛔");
            tempo(2000, () -> menuCurto());
        }

        switch (opcao) {
            case 1:
                System.out.println("Menu Principal ◀️");
                menuOperacional();
                break;
            case 2:
                System.out.println("Encerrando o Acesso");
                userInput.close();
                System.out.println("Nós da BoraCodar Bank Agradecemos a sua confiança 💪 🏦");
                System.exit(0);
                break;
        }

    }

    public static void menuPrincipal(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("Consultar saldo 💵");
                consultarSaldo();
                break;
            case 2:
                System.out.println("Depositar Valor 📩");
                depositarValor();
                break;
            case 3:
                System.out.println("Sacar Valor 💸");
                sacarValor();
                break;
            case 4:
                System.out.println("Encerrando o Acesso");
                userInput.close();
                System.out.println("Nós daBoraCodar Bank Agradecemos a sua confiança 💪 🏦");
                System.exit(0);
                break;
        }
    }

    public static void menuOperacional() {

        System.out.println("Acessando o menu principal... Por favor aguarde. ⏱️");
        tempo(2000, () -> {
            System.out.println("""
                                        
                        Opções:
                                        
                        🔓                
                                        
                            1. Consultar saldo 💵
                            2. Depositar Valor 📩
                            3. Sacar Valor 💸
                            4. Encerrar Acesso 🔐
                            
                            🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦🏦
                                                                                              
                        """);

            int opcao = userInput.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("⛔ Opção inválida! ⛔");
                menuOperacional();
            } else {
                menuPrincipal(opcao);
            }
        });

    }

    public static void consultarSaldo() {

        System.out.println("Consultando saldo... Por favor aguarde. ⏱️");

        tempo(2000, () -> {
            System.out.println("""
                        💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵
                                                                                                 
                        Seu saldo atual é: R$ """ + saldo + """
                                                                                                  
                        💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵
                                                            
                            """);
        });

        tempo(5000, () -> menuCurto());

    }

    public static void tempo ( int delay, Runnable tarefa) {
        Timer cronometro = new Timer();

        cronometro.schedule(new TimerTask() {
            @Override
            public void run() {
                tarefa.run();
            }
        }, delay);
    }

}

