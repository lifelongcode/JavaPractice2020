package com.ap.singleton;

public class Main {

    public static void main(String[] args) {

        //Instantiating Singleton class with variable x
        //We can not create an object like below
        //Singleton abc = Singleton();
        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();

        Singleton z = Singleton.getInstance();

        //Print the hash code for above variable as declared
        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());

        //Now condition to check
        if(x ==y & y ==z){
            System.out.println("Three objects point to the same memory " +
                    "location in the heap i.e to the same object");
        }else{
            System.out.println("Three objects do not point to the same memory " +
                    "location on the heap");
        }
    }
}
