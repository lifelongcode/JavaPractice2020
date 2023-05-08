package com.ap.lombok.val;

public class Main {

    public static void main(String[] args) {
        ValExamWithoutLombok withoutLombok = new ValExamWithoutLombok();
        //invoke return type method
        System.out.println(withoutLombok.example());
        //invoke void type method
        withoutLombok.anotherExample();

        System.out.println();
        ValExamWithLombok withLombok = new ValExamWithLombok();
        //invoke return type method
        System.out.println(withLombok.exmapleOne());
        withLombok.exampleTwo();

    }
}
