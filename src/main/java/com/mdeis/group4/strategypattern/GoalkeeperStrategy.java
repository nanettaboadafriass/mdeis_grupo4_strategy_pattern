package com.mdeis.group4.strategypattern;


public class GoalkeeperStrategy implements GameStrategy {

    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Atajando porteria contra %d jugadores \n", numberOfPlayers);
    }
}
