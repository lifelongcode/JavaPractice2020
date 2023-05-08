package com.ap.polymorphism;

public class Dog extends Animal{

    @Override
    public void showSpecies(){
        System.out.println("I am a dog");
    }

    @Override
    public void makeSound(){
        System.out.println("woof... woof");
    }
}
