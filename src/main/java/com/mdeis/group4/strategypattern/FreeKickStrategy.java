package com.mdeis.group4.strategypattern;

public class FreeKickStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Pateando tiro libre con %d jugadores\n", numberOfPlayers);
    }
}
