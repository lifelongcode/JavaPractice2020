package com.ap.stringexmone;

import java.util.ArrayList;

public class StringExmOne {
    public static void main(String[] args) {

        char[] helloChar = {'h','e','l','l','o'};

        //Using enhance for loop
        for(Character chr: helloChar){
            System.out.print(chr);
        }

        //Just for blank line
        System.out.println("\n--------------------------");

        //Using regular for loop
        for(int i =0; i<helloChar.length; i++){
            System.out.print(helloChar[i]);
        }

        System.out.println("\n--------------------------");

        //Creating String object and print it.
        String hi= new String(helloChar);
        System.out.println(hi);

        ArrayList<Character> myChar = new ArrayList<>();
        for(Character listChar:helloChar){
            myChar.add(listChar);
            System.out.print(listChar);
        }

        //using lamda expression
        myChar.forEach(
                x ->
                {
          //         System.out.printf("%s %d\n", x, x.length()) ;
                });
        //Just for blank line
        System.out.println("\n--------------------------");


    }
}
