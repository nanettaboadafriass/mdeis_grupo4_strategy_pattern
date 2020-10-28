package com.mdeis.group4.strategypattern;

public class Team {

    private GameStrategy gameStrategy;

    public Team() {
        this.gameStrategy = new WaitGameStrategy();
    }

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void play(int numberOfPlayers) {
        this.gameStrategy.play(numberOfPlayers);
    }
}
