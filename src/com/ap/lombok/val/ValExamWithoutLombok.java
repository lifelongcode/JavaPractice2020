package com.ap.lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValExamWithoutLombok {

    public String example(){
        final ArrayList<String> myExample = new ArrayList<>();
        myExample.add("Hello, World");
        final String foo = myExample.get(0);
        return foo.toLowerCase();
    }

    public void anotherExample(){
        final HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(5, "Five");
        myMap.put(7, "Seven");
        //Enhance for loop
        for(final Map.Entry<Integer, String> myEntry: myMap.entrySet()){
            /**
             %d - Take the next argument and print it as an int
             %s - Take the next argument and print it as a string
             %d tells printf that the corresponding argument is to be treated as an integer value
             */
            System.out.printf("%d  %s\n", myEntry.getKey(), myEntry.getValue());
        }
    }
}
