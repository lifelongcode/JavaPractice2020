package com.ap.lombok.val;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

public class ValExamWithLombok {
    public String exmapleOne(){
        val myExm = new ArrayList<String>();
        myExm.add("Hello! World");
        val foo = myExm.get(0);
        return foo.toLowerCase();
    }

    public void exampleTwo(){
        val exam = new HashMap<Integer, String>();
        exam.put(5, "Five");
        exam.put(9, "Nine");
        for(val myEntry : exam.entrySet()){
            System.out.printf("%d: %s\n", myEntry.getKey(), myEntry.getValue());

        }
    }

}
