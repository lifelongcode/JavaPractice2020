/**
    This is the simple java program where we will use
    ArrayList, data type String, and also we are going to use
    lambda to print the elements,
    So, it will print element and length
 */

package com.ap.listforeachlambda;

import java.util.ArrayList;

public class ListForEachWithLambda {

    public static void main(String[] args) {

        String[] names = {"Harry", "Ron", "Hermione", "Ginny"};

        ArrayList<String> nameList = new ArrayList<>();

        //Now lets adding all the string array name to the nameList

        for (String name:names) {
            nameList.add(name);
        }

        /**
         //This was my interview questions using the method inside and
         // remove the element if mathed.

        for (String name:names) {
            if(nameList.add(name) == meetsCondition(name)){
                nameList.remove(name);
            }
        }

         */


        //Since ArrayList is dynamic we can add more element on to it
         //nameList.add("Draco");
        //We are going to use lambda expression to print the nameList
        nameList.forEach(
                x ->
                {
                    System.out.printf("%s %d\n", x, x.length());

            });
        /**
         //We can remove Draco from the nameList
        nameList.remove("Draco");

        System.out.println("-----------------------------");
        nameList.forEach(
                x ->
                {
                    System.out.printf("%s %d\n", x, x.length());

                });
         */

        if (nameList.contains("Hermione")){
            System.out.println("Yes, she is there");
        }else{
            System.out.println("She wasn't there");
        }



    }

    //This is the method was given to me.
    public static boolean meetsCondition(String name){
        return name.equalsIgnoreCase("Ron") || name.equalsIgnoreCase("Ginny");
    }
}
