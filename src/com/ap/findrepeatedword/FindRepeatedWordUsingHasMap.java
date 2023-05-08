package com.ap.findrepeatedword;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 //This is the given array
 String[] myString = {"love","is","beautiful","love","is","wonderful","love","is","blind","human","is","kind"};
    Question is find the repeated words from the array.
 */
public class FindRepeatedWordUsingHasMap {

    public static void main(String[] args) {

        String[] myString = {"love","is","beautiful","love","is","wonderful",
                "love","is","blind","human","is","kind"};

        Map<String, Integer> occurredWord = new HashMap<>();

        //lets used to enhance for loop
        for(String myWord: myString){
            if(occurredWord.containsKey(myWord)){
                occurredWord.put(myWord, occurredWord.get(myWord) + 1);
            }else{
                occurredWord.put(myWord, 1);
            }

        }

        //For print all the words how many repeated, we need to use set
        Set<String> Keys = occurredWord.keySet();

        //lets used to enhance for loop forEach
        for (String checkWord: Keys) {
            if(occurredWord.get(checkWord) > 1){
                System.out.println("String " + checkWord + " repeats " + occurredWord.get(checkWord) + " times");
            }

        }

    }

}
