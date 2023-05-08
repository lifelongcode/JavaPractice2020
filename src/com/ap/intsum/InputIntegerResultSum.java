/**
  This is the simple java program
  When user input a number, it will find the sum
  e.g if user input 451, result will be 10
 */


package com.ap.intsum;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputIntegerResultSum {

    public static void main(String[] args) {

        int sum = 0;
        int userInput;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter a Number ");
        try{
            //Since we are taking any type of input first to convert an integer
            //therefore, we need to create String first then convert it

            userInput = Integer.parseInt(keyboard.nextLine());
            while (userInput > 0){
                int reminder = userInput % 10;
                sum += reminder;
                userInput /= 10;
            }
        }catch (NumberFormatException exc)
        {
            System.out.println("Please enter number");
            //if we want again giving chance we can write below code

//            userInput = Integer.parseInt(keyboard.nextLine());
//            while (userInput > 0){
//                int reminder = userInput % 10;
//                sum += reminder;
//                userInput /= 10;
//            }
        }
        //Or we can go through loop until user put the correct input

        System.out.println("Sum of the digit of Given Number is " + sum);

        /*
            lets how it works
            we can see each iteration....
                System.out.println(171%10);
                System.out.println(171/10);
         */

        int num[] = {34, 89, 6, 321, 53, 45,2211,81};
        System.out.println(sumArray(num));
    }

    public static int sumArray(int[] sum){
        int count = 0;
        int addnum =0;
        Set<Integer> mySet = new HashSet<>();
        for(int i =0; i<sum.length; i++){
         while(sum[i] > 0){
             int reminder = sum[i] % 10;
             addnum += reminder;
             sum[i] /= 10;

             if( addnum==(sum[i]))
                 mySet.add(addnum);
             System.out.println("Set: " + mySet.size());
         }
        }

       return addnum;
    }
}
//2566090345
//9198001732
//7328824974