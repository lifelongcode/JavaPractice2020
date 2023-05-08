package com.ap.genericexm;

public class Main {
    public static void main(String[] args) {
        FootballPlayer patrick = new FootballPlayer("Patrick");
        BaseballPlayer jameson = new BaseballPlayer("Jameson");
        SoccerPlayer lionel = new SoccerPlayer("Messi");

        Team<FootballPlayer> cactus = new Team<>("Cactus");
        cactus.addPlayer(patrick);
        //cactus.addPlayer(jameson);
        //cactus.addPlayer(lionel);

        System.out.println("Currently the team " + cactus.getTeamName() + " has total players = " + cactus.numberOfPlayers());
        System.out.println();

        Team<BaseballPlayer> baseballTeam = new Team<>("Yankee");
        baseballTeam.addPlayer(jameson);
        System.out.println("Currently the team " + baseballTeam.getTeamName() + " has total players = " + baseballTeam.numberOfPlayers());
        System.out.println();

        //Check how T extends Player work
        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(lionel);
        System.out.println("Currently the team " + brokenTeam.getTeamName() + "has total players = " + brokenTeam.numberOfPlayers());

    }
}
