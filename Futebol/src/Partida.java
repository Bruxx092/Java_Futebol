public class Partida {
    private Time time1;
    private Time time2;
    private int golsTime1;
    private int golsTime2;

    public Partida(Time time1, Time time2, int golsTime1, int golsTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public Time getTime1() {
        return time1;
    }

    public Time getTime2() {
        return time2;
    }

    public int getGolsTime1() {
        return golsTime1;
    }

    public int getGolsTime2() {
        return golsTime2;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "time1=" + time1.getNome() +
                ", time2=" + time2.getNome() +
                ", golsTime1=" + golsTime1 +
                ", golsTime2=" + golsTime2 +
                '}';
    }
}