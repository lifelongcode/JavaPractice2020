package com.ap.genericexm;

import java.util.ArrayList;

//This is base class
//We are going to use Generics
//bounded top parameter Player as Type, upper bound T have to extends Player
public class Team<T extends Player> {
    private String teamName;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;


    private ArrayList<T> members = new ArrayList<>();

    //Now we need constructor
    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    //Now we are going to add the player on the team
    //Also we want to check if the player already joined

    //((Player)addPlayer).getName() //no more cast required since T extends Player
    public boolean addPlayer(T addPlayer) {
        if (members.contains(addPlayer)) {
            System.out.println(addPlayer.getName() + " is already on this team");
            return false;
        } else {
            members.add(addPlayer);
            System.out.println(addPlayer.getName() + " has been selected for team " + this.teamName);
            return true;
            }
        }

        //We need getter, it will return number of player in team
        public int numberOfPlayers(){
            return this.members.size();
        }

        //Creating a method for result
    public void matchResult( Team opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        }else if(ourScore == theirScore){
            tied++;
        } else {
            lost++;
        }
        played++;
        if(opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    //Ranking...
    public int ranking(){
        return(won * 2) + tied;
    }
}
