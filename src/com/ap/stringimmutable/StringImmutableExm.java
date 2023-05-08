package com.ap.stringimmutable;

import java.sql.SQLOutput;

public class StringImmutableExm {
    public static void main(String[] args) {

        //Create two different string variable (object) same content
        String name = "Abraham Parker";
        String student="Abraham";
        //here it doesn't create new String for student
        // and rather reuses the string literal from pool

        System.out.println("name " + name + " "+ "student "+student);
        System.out.println("=========== After changing value ============");
        System.out.println("name " + name);


    }
}
