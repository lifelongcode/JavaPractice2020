package com.ap.stackandheap;

public class Person {
    //instance variables
    private String name;
    private int age;

    //constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void addOneAndPrint(String str){
        int valueToAdd= 1;                  //local primitive variable in stack
        this.age = this.age + valueToAdd;   //instance variable in heap is mutated to 40 via "str" reference in stack
        System.out.println(str + "! " + this);
    }

    @Override
    public String toString(){
        return name + " you are now " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Abraham", 39);
        String greeting = "Welcome";
        p1.addOneAndPrint(greeting);

    }

}
