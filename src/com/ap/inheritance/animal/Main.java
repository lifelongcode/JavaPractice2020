package com.ap.inheritance.animal;

public class Main {

    public static void main(String[] args) {
            Dog myDog = new Dog("Rocky", 1, 2, 2, 1);
            System.out.println("I have a Dog, his name is " + myDog.getName());
            myDog.eat();
            myDog.sleep();

        Dog newDog = new Dog();
        newDog.setName("Luca");
        newDog.setAge(2);

        newDog.eat();

    }
}
