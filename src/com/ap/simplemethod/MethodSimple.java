package com.ap.simplemethod;

import java.util.Scanner;

public class MethodSimple {

    public static int addNum(int num){
        int addResult = num + num;
        return addResult;
    }

    public static int subNum(int num){
        int subResult = num - num;
        return subResult;
    }
    public static int mulNum(int num){
        int mulResult = num * num;
        return mulResult;
        // return subResult;
    }

    public static int divNum(int num){
        int divResult = num / num;
        return divResult;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");

        try {
            //below line of code we can use just without try catch
            //int input = keyboard.nextInt();

            //when we use try catch use like that
            int input = Integer.parseInt(keyboard.nextLine());
            System.out.println(input + " + " + input + " = " + addNum(input));
            System.out.println(input + " - " + input + " = " + subNum(input));
            System.out.println(input + " * " + input + " = " + mulNum(input));
            System.out.println(input + " / " + input + " = " + divNum(input));

        } catch (NumberFormatException exe) {
            System.out.println("Wrong Input, Please enter an integer.");
        }
    }
}
