package com.ap.withlombokval;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 This is the Vanilla Java without using Lombok
 */

public class ValExample {
    public String example(){
        final ArrayList<String> example = new ArrayList<>();
        example.add("Hello, world!");
        final String foo = example.get(0);
        return foo.toLowerCase();
    }

    public void example2(){
        final HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(0, "zero");
        myMap.put(5, "five");
        myMap.put(7, "seven");

        for(final Map.Entry<Integer, String> entry: myMap.entrySet()){
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
