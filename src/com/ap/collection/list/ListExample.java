package com.ap.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Abraham");
        myList.add("Parker");
        myList.add("Mst");
        myList.add("Jenifer");
        myList.add("Arian");
        myList.add("Aiden");

        //now, let's say if you have to print every person name and the length
        System.out.println("Name           " + "  length" +"\n------------------------");
        myList.forEach(
                x ->{
                    System.out.printf("%s %d\n", x,x.length());
                }
        );

        //blank line
        System.out.println();


        //Let's say we have Array of names
        String[] employees = {"Maruf", "Shuvo", "Manik", "HShole"};

        //next we want to add all the employees to ArrayList
        ArrayList<String> twinkleEmployee = new ArrayList<>();
        for(String elm: employees){
            twinkleEmployee.add(elm);
        }

        //after that we can use forEach with lamda expression to print.
        twinkleEmployee.forEach(
                x->{
                    System.out.printf("%s %d\n", x, x.length());
                }
        );

    }
}
