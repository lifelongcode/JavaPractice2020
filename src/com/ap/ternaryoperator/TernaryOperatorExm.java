package com.ap.ternaryoperator;

/**
 Question was asking 'Write a program using ternary operator
 to check whether 27 is a multiple of 3 or not.
 */
public class TernaryOperatorExm {
    public static void main(String[] args) {
        System.out.println((27 % 3 == 0)? "Multiple of 3, Yes": "Not a multiple of 3");
        System.out.println("Since it is true... Therefore, answer first part \"Multiple of 3, Yes\"");
        System.out.println("let's check if it is wrong .. what would be the output");

        System.out.println((37 % 3 == 0)? "Multiple of 3": "Not a multiple of 3");
        System.out.println("Since it is wrong... Therefore, answer second part \"Not a Multiple of 3\"");
    }
}
