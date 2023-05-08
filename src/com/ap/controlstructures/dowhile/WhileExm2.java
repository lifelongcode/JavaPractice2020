package com.ap.controlstructures.dowhile;

import java.util.Scanner;

public class WhileExm2 {

    public static void main(String[] args) {

        int inputNumber = 0;
        int sumOfDigits =0;
        int temp = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter an integer ");
        inputNumber = keyboard.nextInt();

        while(inputNumber > 0){
            temp = inputNumber % 10;
            sumOfDigits += temp;
            inputNumber /= 10;  // also we can write inputNumber = inputNumber / 10;
        }
        System.out.println("Sum of digits are : " + sumOfDigits);

    }
}
