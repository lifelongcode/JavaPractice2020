package com.ap.collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        //First Create a has map
        HashMap hmap = new HashMap();

        //Now let's put elements to the map
        hmap.put("Harry", 3443.97);
        hmap.put("Hermione", 187.79);
        hmap.put("Ron", 283.16);
        hmap.put("Draco", 210.21);

        //Next get a set of the entries
        Set mySet = hmap.entrySet();

        //Get an iterator
        Iterator iter = mySet.iterator();
        //Display the elements
        while(iter.hasNext()) {
            Map.Entry me = (Map.Entry) iter.next();
            System.out.println(me.getKey() + ": " + me.getValue());
           // System.out.println(me.getValue());
        }
        System.out.println();
            //Let's say how update each one of value, For Example
            double balance = ((Double)hmap.get("Harry")).doubleValue();
            hmap.put("Harry", balance + 1000);
            System.out.println("Harry's new Balance: " + hmap.get("Harry"));
    }
}
