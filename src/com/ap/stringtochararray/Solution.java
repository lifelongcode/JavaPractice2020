package com.ap.stringtochararray;

public class Solution {

    public static void main(String[] args) {
        String name = "Abraham";

        char[] ctca = name.toCharArray();
        for(char c: ctca){
            System.out.print(c + ",");
        }
        System.out.println("\n----------------------");

        //Another way we can convert String to char
        char[] ch = new char[name.length()];
        //Copying character by character into array
        //using for each loop
        for(int i=0; i<name.length(); i++){
            ch[i] = name.charAt(i);
        }

        //Now we can print out
        for(char element: ch){
            System.out.println(element);
        }
    }
}
