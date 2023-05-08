package com.ap.palindromefromarray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FindPalindromeFromArray fp = new FindPalindromeFromArray();

       int sum =0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter the number of element for the array ");
        int num = keyboard.nextInt();
        //declare an array and assign the size which user just input
        int[] myArray = new int[num];
        System.out.println("Enter the Array element ");

        for(int i=0; i<num; i++){
            myArray[i] = keyboard.nextInt();
            sum += myArray[i];
        }
        System.out.println("Sum : " + sum);
            fp.palindromeFromArray(num, myArray);
    }

}
