package com.ap;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeTest {

    public static void reversIt(int[] input){
        int maxIndex = input.length -1;
        int halfOfLength = input.length / 2;

        for(int i =0; i<halfOfLength; i++){
            int temp;
            temp =input[i];
            input[i] = input[maxIndex - i];
            input[maxIndex -i] = temp;

        }
    }

    public static void main(String[] args) {
        int [] myArray = {10,20,30,40,50,60,70};
        reversIt(myArray);

        System.out.println("Reverse Array is " + Arrays.toString(myArray));
        String original;
        StringBuilder reverse= new StringBuilder();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the word to see is palindrome or not");
        original=keyboard.nextLine();
        int n = original.length()-1;

        for(int i=n; i>=0; i--)
            reverse.append(original.charAt(i));
        if(original.equals(reverse.toString())){
            System.out.println("Yes, your input is Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        keyboard.close();

    }

    }










