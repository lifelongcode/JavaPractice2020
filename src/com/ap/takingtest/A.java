package com.ap.takingtest;

public class A {
    public static int add(int i, int j){
        return i + j;
    }
}
class B extends A {

    public static void main(String[] args) {
        short s = 9;
        System.out.println(A.add(s, 6));
    }
}

