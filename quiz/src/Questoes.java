import java.util.ArrayList;
import java.util.Scanner;

public class Questoes {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        Scanner Entrada = new Scanner(System.in);
        int Pontos = 0;
        // ArrayList para armazenar as perguntas e as respostas!
        ArrayList<String> perguntas = new ArrayList<>();
        ArrayList<String> respostas = new ArrayList<>();

        // Perguntas do Quiz.
        perguntas.add("O número atômico do Tungstênio é 74? ");
        perguntas.add("A prova do Enem pode ser feita a lápis? ");
        perguntas.add("Cães e gatos podem comer chocolate?");

        // Responda com (S) para Sim ou (N) para Não.
        respostas.add("S");
        respostas.add("N");

        // Informar o nome do Jogador.
        System.out.println( "Digite aqui o seu nome de Usúario: " );
        String nome = Entrada.nextLine();

        // Recebendo a resposta
        for (String p : perguntas) {
            System.out.println("\n  " + perguntas.get(0));
            p = resposta.next(respostas.get(0));

            // Verificando se a condição é verdadeira ou falsa dentro dos paramêtros desejados.
            if ("S".equals(p)) {
                System.out.println("Resposta certa");
                Pontos = Pontos + 10;
            } else {
                System.out.println("Resposta errada");
            }

            // Recebendo a resposta
            System.out.println("\n  " + perguntas.get(1));
            p = resposta.next();

            // Verificando se a condição é verdadeira ou falsa dentro dos paramêtros desejados.
            if ("N".equals(p)) {
                System.out.println("Resposta certa ");
                Pontos = Pontos + 10;
            } else {
                System.out.println("Resposta errada");
            }

            // Recebendo a resposta
            System.out.println("\n  " + perguntas.get(2));
            p = resposta.next();

            // Verificando se a condição é verdadeira ou falsa dentro dos paramêtros desejados.
            if ("N".equals(p)) {
                System.out.println("Resposta certa ");
                Pontos = Pontos + 10;
            } else {
                System.out.println("Resposta errada");
            }
            // Placar
            if (Pontos >= 20) {
                System.out.println("Parabéns Jogador(a) " + nome + " você chegou ao final do quiz com " + Pontos + " pontos");
            } else {
                System.out.println("Pontuação insuficiente jogador(a) " + nome + "\n" +  Pontos + "pontos");
            }
            break;



        }
    }
}



