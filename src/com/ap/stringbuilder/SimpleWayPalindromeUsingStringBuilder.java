package com.ap.stringbuilder;

public class SimpleWayPalindromeUsingStringBuilder {

    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        String myString = "madam I madam";


        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse(); //reverse it

        //now you can print out
        System.out.println(sb);

        StringBuilder sbMadam = new StringBuilder(myString);
        sbMadam.reverse();
        System.out.println(sbMadam);


    }
}
