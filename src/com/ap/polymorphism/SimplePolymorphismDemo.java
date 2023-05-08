package com.ap.polymorphism;

public class SimplePolymorphismDemo {

    public static void main(String[] args) {
        //Declare an initial reference variable
        Animal myAnimal;

        //Reference an Animal object
        myAnimal = new Animal();
        myAnimal.showSpecies();
        myAnimal.makeSound();

        //Reference Dog object
        myAnimal = new Dog();
        myAnimal.showSpecies();
        myAnimal.makeSound();

        //Reference Cat object
        myAnimal = new Cat();
        myAnimal.showSpecies();
        myAnimal.makeSound();

        /**
         This behavior is happens in java something called Dynamic Binding.
         When programme is running and we have reference variable first to
         then an object.
         That reference variable to call overridden method
         */

        /**
            Java virtual machine determines which method to call
            base on the type of the object being referred to.

            X NOT ON THE TYPE OF THE REFERENCE VARIABLE.
         */

    }
}
