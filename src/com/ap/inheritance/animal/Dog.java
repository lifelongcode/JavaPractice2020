package com.ap.inheritance.animal;

public class Dog extends Animal{
    private int eyes;
    private int tail;

    public Dog(){

    }
    public Dog(String name, int age, int body, int eyes, int tail ) {
        super(name, age, body);
        this.eyes = eyes;
        this.tail = tail;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }


    @Override
    public void eat() {
//        System.out.println(getName() + " eat big bone");
        System.out.println("Dog eat() method called");
        chew();
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void sleep() {
        System.out.println("Dog can sleep");
        System.out.println("When dog became adult, it can pee to the electricity pillar uphold the one leg");

    }
}
