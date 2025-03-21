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

    public void mostrarJogosAnteriores() {
        System.out.println("\n=== JOGOS ANTERIORES ===");
        for (int i = 0; i < partidas.size(); i++) {
            Partida partida = partidas.get(i);
            System.out.println("Jogo " + (i + 1) + ": " + partida);
        }
    }
}