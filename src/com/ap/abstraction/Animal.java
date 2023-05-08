package com.ap.abstraction;

public abstract class Animal {
    //Let's create an abstract method which will not have a body
    public abstract void animalSound();

    //Regular method
    public void sleep(){
        System.out.println("ZZzzzzzZzzzzz...");
    }
}

