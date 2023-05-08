/**
    What is set?
    Set is part of collection. It is allowed unique value,
    Do not allow duplicate value
    Why do we use it?
    let's we need to use Unique such as id,

 */



package com.ap.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExm {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet();
        mySet.add("One");
        mySet.add("Two");
        mySet.add("Three");
        mySet.add("Four");
        mySet.add("Five");

        //Note if there duplicate value it won't print because it is hashset
        Iterator<String> i = mySet.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("----------------------------------");

        Set<String> setOne = new HashSet<>();
        setOne.add("One");
        setOne.add("Ten");
        setOne.add("Five");
        setOne.add("Fifty");
        setOne.add("Hundred");

        Iterator<String> index = setOne.iterator();
        while(index.hasNext()){
            System.out.println(index.next());
        }

    }
}
