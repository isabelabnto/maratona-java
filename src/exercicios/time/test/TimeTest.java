package exercicios.time.test;

import exercicios.time.dominio.Jogador;
import exercicios.time.dominio.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time("Seleção BR");
        Jogador jogador1 = new Jogador("Thiago Silva", 41);
        Jogador jogador2 = new Jogador("Neymar Júnior", 34);
        Jogador jogador3 = new Jogador("Hulk", 37);
        Jogador[] jogadores = new Jogador[3];
        jogadores[0] = jogador1;
        jogadores[1] = jogador2;
        jogadores[2] = jogador3;

        time1.setJogadores(jogadores);

        System.out.println(time1.getNomeTime());
        time1.imprimeTime();
    }
}
