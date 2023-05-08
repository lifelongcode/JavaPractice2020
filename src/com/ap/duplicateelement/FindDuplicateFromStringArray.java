package com.ap.duplicateelement;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromStringArray {

    public static void main(String[] args) {
        String[] myFriendNames = {"Mike", "Jacob", "Amar", "Soyeb", "Shiplu", "Shiplu", "Raisul", "Mike"};
        boolean isPresent = false;

        for (int i = 0; i < myFriendNames.length - 1; i++) {
            for (int j = i + 1; j < myFriendNames.length; j++) {
                if (myFriendNames[i].equals(myFriendNames[j])) {
                    System.out.println("Duplicate " + myFriendNames[j]);
                    isPresent = true;
                }
            }
        }
        if (!isPresent) {
            System.out.println("Sorry! We couldn't find the duplicate.");
        }


        //Blank Line
        System.out.println("------------------------------------------");
        // Second solution : use HashSet data structure to find duplicates
        //Important note, here: store value false will bring the duplicate value
        System.out.println("Duplicate elements from array using HashSet data structure");
        Set<String> store = new HashSet<>();

        for (String name : myFriendNames) {
            if (store.add(name) == false) {
                System.out.println("found a duplicate element in array : "
                        + name );
            }
        }

    }
}
