package montyHall;

import java.util.Random;
import java.util.Scanner;

public class montyHall {
    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        Integer portaEscolhida;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Bem-vindo ao jogo Monty Hall!");
do {
    System.out.println("Escolha uma porta (0, 1 ou 2): ");
    portaEscolhida = sc.nextInt();
    if(portaEscolhida < 0 || portaEscolhida > 2){
        System.out.println("Porta Inválida!");
    }
}while(portaEscolhida < 0 || portaEscolhida > 2);

        Integer portaPremiada = rnd.nextInt(3);
        Integer portaVazia;

        do {
            portaVazia = rnd.nextInt(3);
        }
        while (portaVazia.equals(portaEscolhida) || portaVazia.equals(portaPremiada));

        System.out.println("A porta escolhida foi: " + portaEscolhida);
        System.out.println("A porta " + portaVazia + " foi aberta");
        System.out.println("Deseja trocar de porta?");

        do {
            System.out.println("Escolha uma porta: ");
            portaEscolhida = sc.nextInt();
            if(portaEscolhida.equals(portaVazia)){
                System.out.println("Essa porta já foi aberta!");
            }
        }while(portaEscolhida.equals(portaVazia));

        if (portaEscolhida.equals(portaPremiada)) {
            System.out.println("Parabéns, Você ganhou!");
        } else {
            System.out.println("Que pena! Você perdeu!");
        }
        System.out.println("Porta Escolhida: " + portaEscolhida);
        System.out.println("Porta Premiada: " + portaPremiada);
        System.out.println("Porta Vazia: " + portaVazia);
    }
}