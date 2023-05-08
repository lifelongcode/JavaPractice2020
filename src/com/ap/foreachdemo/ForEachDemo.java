package com.ap.foreachdemo;


import java.util.ArrayList;

import java.util.List;

/**
    This is the simple example, how to use iterable forEach
 */
public class ForEachDemo {

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Carlos", "Debby"};

        //Let's create List
        List<String> myList = new ArrayList<>();

        //Now add element in the list, how can we do that
        //We can use enhance for loop
        for(String element: names){
            myList.add(element);
        }

        //Since we already all the array elements to the myList
        //it's time to printout. We are going to use lambda expression to print
        //all the elements and his length of character
        myList.forEach(
                x->{
                    System.out.printf("%s %d\n", x, x.length());
                });
    }
}
