package com.ap.permutation;
/**
    nPr = n! / (n-r)! this is the formula for permutation
 */

import java.util.Arrays;
public class PermutationExm {

    //First let's creat a sort method which will
    //sort the word, example love
    //sorting as elov
    public String sort(String input){
        char[] content = input.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public boolean permutation(String str, String t){
        if(str.length() != t.length()){
            return false;
        }
        return (sort(str).equals(sort(t)));
    }
}
