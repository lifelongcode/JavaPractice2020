package com.ap.abstraction;

public class Main {

    public static void main(String[] args) {


        //Let's say we are trying to create object animal class
        //'Animal' is abstract; cannot be instantiated.
        //Animal an = new Animal();
        Pig myPig = new Pig();// Create a Pig object
        myPig.animalSound();
        myPig.sleep();

        Horse myHours= new Horse();
        myHours.animalSound();
        myHours.sleep();

    }
}
