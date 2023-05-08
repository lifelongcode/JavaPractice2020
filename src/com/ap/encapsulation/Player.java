package com.ap.encapsulation;

public class Player {
    private String name;
    private int health = 100;
    private String weapon;

    public Player(){
    }

    public Player(String name, int health, String weapon) {
        this.name = name;
        //here is validation for health
        if(health >0 && health <=100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
