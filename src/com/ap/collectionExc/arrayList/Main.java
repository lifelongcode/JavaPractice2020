/**
    This is the example why we need to learn Generics.
    What type of objects we are going to store it.
 */

/**
    A generic class or method is one of the permits you to specify the allowable types
    of objects that the class or method work with. If you attempt to use
    the class or method with an object that is not an allowable type, an errors occurs
    at compile time.
 */

package com.ap.collectionExc.arrayList;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList items = new ArrayList();

        items.add(10);
        items.add(20);
        items.add(30);
        items.add(40);
        items.add(50);

        printDoubleContent(items);

        List<Integer> myItems = new ArrayList<>();
        myItems.add(50);
        myItems.add(100);
        myItems.add(200);
        myItems.add(300);
        myItems.add(500);

        System.out.println("-----------------------------------");
        //call the method
        printDoubleEachContent(myItems);

    }

    private static void printDoubleContent(ArrayList n){
        for(Object i: n){
            //We have to tell java what type of object is actually in the ArrayList
            //We have to cast Integer
            System.out.println((Integer) i * 2);
        }

    }

    //Also, same kind of method passing argument as List

    public static void printDoubleEachContent(List n){
        for(Object i: n){
            //We have to tell java what type of object is actually in the ArrayList
            //We have to cast Integer
            System.out.println((Integer) i * 2);
        }
    }
}
