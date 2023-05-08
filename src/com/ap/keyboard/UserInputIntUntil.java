package com.ap.keyboard;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputIntUntil {
    public static void main(String[] args) {
        //We have to create a Scanner object for keyboard input from the user.
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        boolean correctInput = true;

        do{
            System.out.println("Please Enter an integer ");
            String input = keyboard.nextLine();
            try{
                int number = Integer.parseInt(input);
                while(number > 0) {
                    int remainder = number % 10;
                    sum += remainder;
                    number /= 10;
                }
                correctInput = false;
            }catch(Exception e){
                System.out.println("Enter number only");
            }
        }while(correctInput); {
            /**
             * By the time we reach this point in the program, we
             * know we have found the correct input by the user
             */

        }
        System.out.println("Sum " + sum);
    }
}