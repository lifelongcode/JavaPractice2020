package com.ap.abstraction;

public class Horse extends Animal{

    public void animalSound(){
        System.out.println("Horse says: " + " neh .. neh neih!!!");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("But the fact is when horse sleeps, still stand up!");
    }
}
