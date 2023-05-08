package com.ap.polymorphism;

public class Cat extends Animal{

    @Override
    public void showSpecies(){
        System.out.println("I'm a cat");
    }

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
