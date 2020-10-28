package com.mdeis.group4.strategypattern;

public class CornerKickStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Sacando desde la esquina con %d jugadores\n", numberOfPlayers);
    }
}
