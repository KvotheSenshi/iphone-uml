package application;

import java.util.Scanner;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    public void ligar() {
        System.out.println("Fazendo Ligação . . . ");
    }

    public void atender() {
        System.out.println("Atendendo ligação");

    }

    public void iniciarCorreioVoz() {

        System.out.println("Iniciando correio de voz");

    }

    public void tocar() {
        System.out.println("Reproduzindo música");

    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica() {

        System.out.println("Música selecionada");

    }

    public void exibirPagina() {
        System.out.println("Exibindo página");

    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");

    }

    public void atualizarPagina() {
        System.out.println("Atuzlizando página");

    }

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao;

        do {

            System.out.println("Selecione uma opção no menu: \n +" + "1: Efetuar ligação \n +"
                    + "2: Atender ligação \n +" + "3; Iniciar correio de voz \n +" + "4: Selecionar música \n +"
                    + "5: Tocar música \n +" + "6: Pausar música \n +" + "7: Exibir página no navegador \n +"
                    + "8: Abrir nova aba no navegaor \n +" + "9: Atualizar página no navegador \n +" + "0: Desligar");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    iphone.ligar();
                    Thread.sleep(1000);
                    break;

                case 2:
                    iphone.atender();
                    Thread.sleep(1000);
                    break;

                case 3:
                    iphone.iniciarCorreioVoz();
                    Thread.sleep(1000);
                    break;

                case 4:
                    iphone.selecionarMusica();
                    Thread.sleep(1000);
                    break;

                case 5:
                    iphone.tocar();
                    Thread.sleep(1000);
                    break;

                case 6:
                    iphone.pausar();
                    Thread.sleep(1000);
                    break;

                case 7:
                    iphone.exibirPagina();
                    Thread.sleep(1000);
                    break;

                case 8:
                    iphone.adicionarNovaAba();
                    Thread.sleep(1000);
                    break;

                case 9:
                    iphone.atualizarPagina();
                    Thread.sleep(1000);
                    break;

                case 0:
                    System.out.println("Desligando o aparelho");
                    Thread.sleep(900);
                    break;

                default:

                    System.out.println("Opção inválida, insira um número de 0 a 9.");
                    Thread.sleep(1000);

            }

        } while (opcao != 0);
        sc.close();

    }
}
