package com.mdeis.group4.strategypattern;

public class StrategyApp {

    public static void main(String[] args) {

        Team team = new Team();
        team.play(0);

        // Medio Ataque
        team.setGameStrategy(new HalfAttackStrategy());
        team.play(1);

        // Tenemos el balon
        team.setGameStrategy(new AttackStrategy());
        team.play(5);

        //Pateamos al arco
        team.setGameStrategy(new KickGoalStrategy());
        team.play(3);

        //Hay que sacar desde la esquina
        team.setGameStrategy(new CornerKickStrategy());
        team.play(3);

        team.setGameStrategy(numberOfPlayers -> System.out.println("Simula faltas"));
        team.play(0);

        //Hay que patear el tiro libre
        team.setGameStrategy(new FreeKickStrategy());
        team.play(3);

        // Sin balon
        team.setGameStrategy(new DefenseStrategy());
        team.play(8);

        //Llegan a porteria, hay que defender
        team.setGameStrategy(new GoalkeeperStrategy());
        team.play(3);
    }
}
