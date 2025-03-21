import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private List<Partida> partidas;

    public Campeonato() {
        this.partidas = new ArrayList<>();
    }

    public void adicionarPartida(Partida partida) {
        partidas.add(partida);
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void mostrarResultados() {
        for (Partida partida : partidas) {
            System.out.println(partida);
        }
    }

    public void mostrarJogadoresDosTimes() {
        for (Partida partida : partidas) {
            System.out.println("\nJogadores do " + partida.getTime1().getNome() + ":");
            for (Jogador jogador : partida.getTime1().getJogadores()) {
                System.out.println(jogador);
            }

            System.out.println("\nJogadores do " + partida.getTime2().getNome() + ":");
            for (Jogador jogador : partida.getTime2().getJogadores()) {
                System.out.println(jogador);
            }
        }
    }
}