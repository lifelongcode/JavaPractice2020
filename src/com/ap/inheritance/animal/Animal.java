package com.ap.inheritance.animal;

/**
    This is the example of Inheritance
    Animal class is a super class
*/


public class Animal {

    private String name;
    private int age;
    private int body;

    public Animal(){
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, int body) {
        this.name = name;
        this.age = age;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public void eat(){
        System.out.println("Animal eat(), called");
    }

    public void move(){
        System.out.println("It can run faster");
    }

    public void sleep(){
        System.out.println("Animal can sleep");
    }
}
