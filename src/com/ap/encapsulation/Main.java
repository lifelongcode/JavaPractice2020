package com.ap.encapsulation;

public class Main {
    public static void main(String[] args) {
        Player np = new Player("Abraham", 75, "Sword");
        System.out.println("The Player name is " +np.getName().toUpperCase() + "\nInitial health is "
                + np.getHealth() + "\nhas weapon "+ np.getWeapon());

        System.out.println();

        Player npone = new Player("Aiden", 95, "Sword and Shield");
        System.out.println("The Player name is " +npone.getName().toUpperCase() + "\nInitial health is "
                + npone.getHealth() + "\nhas weapon "+ npone.getWeapon());

        System.out.println();
        //Since we have default constructor and overloading constructor
        //We can direct set the name, health, and weapon
        Player newPlayer = new Player();
        newPlayer.setName("Jenifer");
        newPlayer.setHealth(79);
        newPlayer.setWeapon("Sword");

        System.out.println("The Player name is " +newPlayer.getName().toUpperCase() + "\nInitial health is "
                + newPlayer.getHealth() + "\nhas weapon "+ newPlayer.getWeapon());

        //after loosing 70 points still survive
        newPlayer.loseHealth(70);

        //lets sey lost more 9 points, all points gone
        newPlayer.loseHealth(9);
    }
}
