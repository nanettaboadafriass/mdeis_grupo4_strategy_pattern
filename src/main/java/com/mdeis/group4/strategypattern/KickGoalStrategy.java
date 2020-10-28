package com.mdeis.group4.strategypattern;

public class KickGoalStrategy implements GameStrategy {

    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Pateando al arco con %d atacantes \n", numberOfPlayers);
    }
}
