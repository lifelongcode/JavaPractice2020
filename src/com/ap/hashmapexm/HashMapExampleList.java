package com.ap.hashmapexm;

import java.util.*;

public class HashMapExampleList {

    public static void main(String[] args) {
        String book = "Four score and seven years ago our fathers brought"
                      +" forth on this continent a new nation conceived in"
                      +" Liberty and dedicated to the proposition that all"
                      +" men are created equal"
                      +" Now we are engaged in a great civil war testing"
                      +" whether that nation or any nation so conceived and"
                      +" so dedicated long endure";

        String[] words = book.split(" ");
        System.out.println(Arrays.asList(words));

        Map<String, List<Integer>> indexMap = new HashMap<>();
        for(int k=0; k<words.length; k++){
            String currentWord = words[k];
            List<Integer> currentWordPositions = indexMap.get(words[k]);

            if(currentWordPositions == null){
                currentWordPositions = new ArrayList<Integer>();
                indexMap.put(currentWord, currentWordPositions);
            }
            currentWordPositions.add(k);
        }

        //Output the result
        //Get a set containing the keys in this map
        Set<String> keys = indexMap.keySet();

        //Now Output the list of page numbers for each word
        for(String w: keys){
            System.out.println(w + " : " + indexMap.get(w));
        }
    }
}
