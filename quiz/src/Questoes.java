import java.util.ArrayList;
import java.util.Scanner;

public class Questoes {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int acertos = 0;
        int erros = 0;


        //Arraylist para armazenar as perguntas e respostas.
        ArrayList<String> perguntas = new ArrayList<>();
        ArrayList<String> respostas = new ArrayList<>();

        // Prguntas do quiz.

        perguntas.add("O Flúor é o elemento mais eletronegativo? "); //Sim
        perguntas.add("Pedro Alvares Cabral foi o primeiro Presidente do Brasil? ");//Não
        perguntas.add("Cães e gatos podem comer chocolate? "); //Não
        perguntas.add("O Brasil é o segundo maior país em número de aeroportos no mundo? ");//sim
        perguntas.add("Quaisquer é a unica palavra do português que possuí o plural no meio? ");//Sim
        perguntas.add("O nome do Brasil vem de uma árvore? "); //Sim
        perguntas.add("O Rio de Janeiro já foi Capital de Portugal? "); //sim
        perguntas.add("A Ilha da Queimada Grande em São Paulo, é proíbido visitação por ser repleta de cobras? "); //Sim
        perguntas.add("O Brasil é o quinto maior país do mundo? "); //sim
        perguntas.add("A pascoa é comemorada no dia 25 de Abril? "); //Não

        //Respostas das Questões.
        respostas.add("S");
        respostas.add("N");

        // Informar o nome do Jogador.
        System.out.println("Digite aqui o seu nome de Usúario: ");
        String nome = Entrada.nextLine();
        
        System.out.println("Digite S para Sim e N para Não");

        for (String r : respostas) {
            // Recebendo a resposta da primeira pergunta.
            System.out.println("\n  " + perguntas.get(0));
            r = Entrada.next();

            // Verificando a resposta da primeira pergunta.
            if ("S".equals(r)) {
                System.out.println("Resposta certa \n");
                acertos = acertos + 1;
            } else {
                System.out.println("Resposta errada \n");
                erros = erros + 1;

            }
            // recebendo a resposta da segunda pergunta.
            System.out.println("\n  " + perguntas.get(1));
            r = Entrada.next();

            //Verficando a resposta da segunda pergunta
            if ("N".equals(r)) {
                System.out.println("Resposta certa \n");
                acertos = acertos + 1;
            } else {
                System.out.println("Resposta errada \n");
                erros = erros + 1;
            }


            // recebendo a resposta da terceira pergunta.
            System.out.println("\n  " + perguntas.get(2));
            r = Entrada.next();

            //verificando a resposta da terceira pergunta.
            if ("N".equals(r)) {
                System.out.println("Resposta certa \n");
                acertos = acertos + 1;
            } else {
                System.out.println("Resposta errada \n");
                erros = erros + 1;
            }
            //recebendo a resposta da quarta pergunta.
            System.out.println("\n " + perguntas.get(3));
            r = Entrada.next();

            //Verificando a resposta da quarta pergunta.
            if ("S".equals(r)) {
                System.out.println("Resposta Certa \n");
                acertos = acertos +1;
            }else {
                System.out.println("Resposta errada \n");
                erros = erros + 1;
            }

            //recebendo a resposta da quinta pergunta.
            System.out.println("\n " + perguntas.get(4));
            r = Entrada.next();

            //Verificando a resposta da quinta pergunta.
            if ("S".equals(r)) {
                System.out.println("Resposta Certa \n");
                acertos = acertos +1;
            }else {
                System.out.println("Resposta errada \n");
                erros = erros + 1;
            }

            //recebendo a resposta da sexta pergunta.
            System.out.println("\n " + perguntas.get(5));
            r = Entrada.next();

            //Verificando a resposta da sexta pergunta.
            if ("S".equals(r)) {
                System.out.println("Resposta Certa \n");
                acertos = acertos +1;
            }else {
                System.out.println("Resposta errada \n");
                erros = erros + 1;
            }

            //recebendo a resposta da sétima pergunta.
            System.out.println("\n " + perguntas.get(6));
            r = Entrada.next();

            //Verificando a resposta da sétima pergunta.
            if ("S".equals(r)) {
                System.out.println("Resposta Certa \n");
                acertos = acertos +1;
            }else {
                System.out.println("Resposta errada \n");
                erros = erros + 1;
            }

            //recebendo a resposta da oitava pergunta.
            System.out.println("\n " + perguntas.get(7));
            r = Entrada.next();

            //Verificando a resposta da oitava pergunta.
            if ("S".equals(r)) {
                System.out.println("Resposta Certa \n");
                acertos = acertos +1;
            }else {
                System.out.println("Resposta errada \n");
                erros = erros + 1;
            }

            //recebendo a resposta da nona pergunta.
            System.out.println("\n " + perguntas.get(8));
            r = Entrada.next();

            //Verificando a resposta da nona pergunta.
            if ("S".equals(r)) {
                System.out.println("Resposta Certa \n");
                acertos = acertos +1;
            }else {
                System.out.println("Resposta errada \n");
                erros = erros + 1;
            }

            //recebendo a resposta da décima pergunta.
            System.out.println("\n " + perguntas.get(9));
            r = Entrada.next();

            //Verificando a resposta da décima pergunta.
            if ("N".equals(r)) {
                System.out.println("Resposta Certa \n");
                acertos = acertos +1;
            }else {
                System.out.println("Resposta errada \n");
                erros = erros + 1;
            }

            // FIM DO QUIZ

            System.out.println("Jogador: " + nome + " você chegou ao final do Quiz. A\n");
            System.out.println("acertos obtidos: " + acertos);
            System.out.println("Erros obtidos: " + erros);


            break;
        }
    }
}


