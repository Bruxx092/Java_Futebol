public class Main {
    public static void main(String[] args) {
        Time timeA = new Time("Time A");
        Time timeB = new Time("Time B");

        timeA.adicionarJogador(new Jogador("Jogador 1", 10));
        timeA.adicionarJogador(new Jogador("Jogador 2", 7));
        timeB.adicionarJogador(new Jogador("Jogador 3", 9));
        timeB.adicionarJogador(new Jogador("Jogador 4", 11));

        Partida partida1 = new Partida(timeA, timeB, 2, 1);
        Partida partida2 = new Partida(timeB, timeA, 0, 3);

        Campeonato campeonato = new Campeonato();
        campeonato.adicionarPartida(partida1);
        campeonato.adicionarPartida(partida2);

        System.out.println("Resultados das Partidas:");
        campeonato.mostrarResultados();

        System.out.println("\nLista de Jogadores:");
        campeonato.mostrarJogadoresDosTimes();
    }
}