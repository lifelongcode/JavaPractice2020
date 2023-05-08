package com.ap.polymorphism;

public class PolyDemo {


    public static void main(String[] args) {
        //Create instances of the Animal, Dog, and Cat classes
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        //Call the static method and Show information about the object
        showAnimalInfo(myAnimal);
        showAnimalInfo(myDog);
        showAnimalInfo(myCat);
    }

    public static void showAnimalInfo(Animal creature){
        creature.showSpecies();
        creature.makeSound();
        System.out.println();
    }
}
