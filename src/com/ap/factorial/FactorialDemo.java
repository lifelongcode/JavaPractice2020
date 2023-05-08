package com.ap.factorial;

import java.util.Scanner;

public class FactorialDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number ");
        //stored the entered value in variable
        int num= keyboard.nextInt();
        //called the user define method fact
        int factorialNum = fact(num);
        System.out.println("You entered the number " + num +
                            "\nFactorial of the number is " + factorialNum);

    }


    public static int fact(int input){
        int output;
        if(input == 0){
            return 1;
        }
        //Recursion: Function calling itself!!
        output = fact(input -1) * input;
        return output;
    }
}
