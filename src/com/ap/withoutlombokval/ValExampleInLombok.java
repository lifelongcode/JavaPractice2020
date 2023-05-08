package com.ap.withoutlombokval;
//This is the example using Lombok Val

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

public class ValExampleInLombok {
    public String example(){
        val example =new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public void example2(){
        val myMap= new HashMap<Integer, String>();
        myMap.put(0, "zero");
        myMap.put(5, "five");
        myMap.put(7, "seven");
    }
}
