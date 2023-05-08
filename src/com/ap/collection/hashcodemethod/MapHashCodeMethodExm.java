package com.ap.collection.hashcodemethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHashCodeMethodExm {

    public static void main(String[] args) {
        //Initializing a Map of type HashMap
        Map<Integer, String > myMap = new HashMap<>();
        myMap.put(1, "One");
        myMap.put(3, "Three");
        myMap.put(5, "Five");
        myMap.put(9, "Nine");
        myMap.put(17, "Seventeenth");
        myMap.put(20, "Twenty");

        //It will print out like that
        //{1=One, 17=Seventeenth, 3=Three, 20=Twenty, 5=Five, 9=Nine}
        System.out.println(myMap.size());
        System.out.println(myMap);
        System.out.println("We are going to remove element " + myMap.remove(20));
        myMap.put(21, "TwentyOne");
        System.out.println("We are going to see what we just add element " + myMap.get(21));

        //Also let's try replace
        myMap.replace(21, "TwentyOne", "Twenty-one");
        System.out.println("We just replace the value " + myMap.get(21) + " To "
                            + " " + myMap.get(21));

        System.out.println("-----------------------******------------------");

        //But if we want to print like that below
        /**
         1 : One
         3 : Three
         5 : Five
         9 : Nine
         17 : Seventeenth
         20 : Twenty
         */
        //Next get set of the entries
        Set newSet = myMap.entrySet();

        //get an iterator
        Iterator iter = newSet.iterator();

        while(iter.hasNext()){
           Map.Entry me = (Map.Entry) iter.next();
            System.out.println(me.getKey() +": " + me.getValue());
        }
        //Above code is kind of tedious
        //let's try easy way

        //System.out.println(myMap);


    }
}
