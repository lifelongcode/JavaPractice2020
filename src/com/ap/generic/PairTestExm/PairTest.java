package com.ap.generic.PairTestExm;

public class PairTest {
    public static void main(String[] args) {
        //First Create an integer to hold an ID number
        Integer idNumber = new Integer(477);
        int id = 77;
        Float fNum = new Float(7.29);
        float fmyn = 29.12f;

        //Create a String to hold a name
        String name = "Abraham, Parker";

        //Now let's create a Pair object to hold the ID
        //Number and the name

        Pair<Integer, String> myPair = new Pair<>(idNumber, name);

        //Display the Pair of item
        System.out.println("ID Number as Integer: " + myPair.getFirst());
        System.out.println("Name: "+myPair.getSecond());

        System.out.println();
        Pair<Integer, String> myPairInt = new Pair<>(id, name);
        //Display the Pair of item
        System.out.println("ID Number as Int: " + myPairInt.getFirst());
        System.out.println("Name: "+myPairInt.getSecond());

        System.out.println();

        //Display the Pari using Float
        Pair<Float, String> myPairFloat = new Pair<>(fNum, name);
        System.out.println("ID Number as Float: " + myPairFloat.getFirst());
        System.out.println("Name: "+myPairFloat.getSecond());


    }
}
