package com.mdeis.group4.strategypattern;

public class WaitGameStrategy implements GameStrategy {

    @Override
    public void play(int numberOfPlayers) {
        System.out.println("Esperar al rival");
    }
}
