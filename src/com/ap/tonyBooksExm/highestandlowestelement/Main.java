package com.ap.tonyBooksExm.highestandlowestelement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //First let's create String array
        String[] names = {"Jack", "Alice", "Maria", "Pablo", "Lakeisha"};
        String[] myNames = {"Harry", "Hermione", "Ron", "Draco", "Albus", "Hagrid"};


        //Now create an object of the HighestAndLowest class
        HighestAndLowest<String> ht = new HighestAndLowest<String>(myNames);

        //We like to print first all the array elements how the position now
        System.out.println(Arrays.asList(myNames));

        //This time we can print out Highest and lowest
        System.out.println("The highest is " + ht.getHighest());
        System.out.println("The lowest is " + ht.getLowest());


        //Intentionally blank space
        System.out.println();

        //Since the program has design a generic we can try also Integer array
        /**
         Note here we can not declare an array like that
         int[] myNum = {21, 12, 34,43, 79, 97, 63};
         error is -> java: incompatible types: int[] cannot be converted to
         java.lang.Integer[]
         */

        Integer[] myNum = {4, 47, 74, 97, 79, 96, 69};
        HighestAndLowest<Integer> iT = new HighestAndLowest<Integer>(myNum);
        System.out.println(Arrays.asList(myNum));
        System.out.println("The bigger number is " + iT.getHighest());
        System.out.println("The lower number is " + iT.getLowest());
    }
}
