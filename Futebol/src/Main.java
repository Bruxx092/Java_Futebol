public class Main {
    public static void main(String[] args) {
        Time timeA = new Time("Time A");
        Time timeB = new Time("Time B");
        Time timeC = new Time("Time C");
        Time timeD = new Time("Time D");

        timeA.adicionarJogador(new Jogador("Jogador 1", 10));
        timeA.adicionarJogador(new Jogador("Jogador 2", 7));
        timeB.adicionarJogador(new Jogador("Jogador 3", 9));
        timeB.adicionarJogador(new Jogador("Jogador 4", 11));
        timeC.adicionarJogador(new Jogador("Jogador 5", 5));
        timeC.adicionarJogador(new Jogador("Jogador 6", 8));
        timeD.adicionarJogador(new Jogador("Jogador 7", 3));
        timeD.adicionarJogador(new Jogador("Jogador 8", 6));

        Partida partida1 = new Partida(timeA, timeB, 2, 1);
        Partida partida2 = new Partida(timeC, timeD, 0, 3);
        Partida partida3 = new Partida(timeA, timeC, 1, 1);
        Partida partida4 = new Partida(timeB, timeD, 2, 2);

        Campeonato campeonato = new Campeonato();
        campeonato.adicionarPartida(partida1);
        campeonato.adicionarPartida(partida2);
        campeonato.adicionarPartida(partida3);
        campeonato.adicionarPartida(partida4);

        campeonato.mostrarJogosAnteriores();

        System.out.println("\n=== JOGADORES ===");
        System.out.println("Jogadores do Time A:");
        for (Jogador jogador : timeA.getJogadores()) {
            System.out.println(jogador);
        }

        System.out.println("\nJogadores do Time B:");
        for (Jogador jogador : timeB.getJogadores()) {
            System.out.println(jogador);
        }

        System.out.println("\nJogadores do Time C:");
        for (Jogador jogador : timeC.getJogadores()) {
            System.out.println(jogador);
        }

        System.out.println("\nJogadores do Time D:");
        for (Jogador jogador : timeD.getJogadores()) {
            System.out.println(jogador);
        }
    }
}