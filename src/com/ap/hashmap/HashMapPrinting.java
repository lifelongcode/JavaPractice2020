package com.ap.hashmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapPrinting {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        //now let's insert few elements to the myMap
        myMap.put("Abraham", 1982);
        myMap.put("Parker", 1982);
        myMap.put("Rahman", 1975);
        myMap.put("Mike", 1984);
       // myMap.put("Abraham", 1982);  //Key has to unique for example
      //  myMap.put("Farhad", 1982);   // Values can be same.

        //We want to print now:
        //Using Enhance for loop, Just key
        for(Object obj: myMap.keySet()){
            System.out.println(obj);
        }
        //You may have Question, why we use Object?
        //Before we use String or Integer or Double  just what type it is, when we use enhance for loop,
        //The simple answer is- Map we create an object myMap
        //It is generic Object class, you can manipulate
        //Also using Object we can play lots of other works

        System.out.println("========================== ***** ====================");
        //The regular way enhance for loop would be key printout, key here is String so
        for(String element: myMap.keySet()){
            System.out.println(element);
        }

        System.out.println("---------------------");
        //Using Enhance for loop, Just Value
        for(Object object: myMap.values()){
            System.out.println(object);
        }


        System.out.println("--------------------------");
        //Using Enhance for loop, KEY + VALUES which will print out
        //For example Abraham=1982
        for(Object myCreatedObj: myMap.entrySet()){
            System.out.println(myCreatedObj);
        }

        System.out.println("--------------------------");
        //Very basic way
        System.out.println(myMap.entrySet());


        System.out.println("----------------------------------------------------");
        //This is one way
        System.out.println(Arrays.asList(myMap));


        System.out.println("----------------------------------------------------");
        //Another way is that
        System.out.println(Collections.singletonList(myMap));

    }
}
