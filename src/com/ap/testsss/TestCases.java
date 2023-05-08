package com.ap.testsss;

public class TestCases {

    public static void main(String[] args) {
        String ts= "CAR";
       //to see the length of the string
        System.out.println(ts.length());

        //checking the index if it is 0 means there is no input.
        //or if input string just a character means A just only one letter
        //we say true, it is a palindrome
        System.out.println((ts.charAt(0) == ts.charAt(ts.length()-1)));

        String pal="racecar";
        System.out.println(pal.substring(1, pal.length()-1));

        String pali="aceca";
        System.out.println(pali.substring(1, pali.length()-1));

        String palin="cec";
        System.out.println(palin.substring(1, palin.length()-1));

        System.out.println("-----------");

        int number = 1000;

        int min = number /60;
        int sec = number % 60;

        System.out.println(min +" "+  sec);
    }
}