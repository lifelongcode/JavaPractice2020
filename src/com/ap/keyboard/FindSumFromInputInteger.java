package com.ap.keyboard;

import java.util.Scanner;

public class FindSumFromInputInteger {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number, we will make it sum ");
        int sum=0;

        int number = keyboard.nextInt();
//        while(number > 0){
//            int remainder = number % 10;
//            sum += remainder;
//            number /= 10;
//        }
//        System.out.println("Here you go , Sum " + sum );

        //Also, we can use for loop to do that, but it will require more
        //calculation for the length.
        int lengthOfNumber = Integer.toString(number).length();



        for(int i=0; i<lengthOfNumber; i++){
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        System.out.println("Here you go , Sum " + sum );
    }
}
