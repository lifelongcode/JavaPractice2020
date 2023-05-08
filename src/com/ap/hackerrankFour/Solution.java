package com.ap.hackerrankFour;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int t = keyboard.nextInt();
        for (int i=0; i<t; i++){
            int a = keyboard.nextInt();
            int b = keyboard.nextInt();
            int n = keyboard.nextInt();

            int calculation = a;
            for (int j=0; j<n; j++){
                calculation +=(Math.pow(2, j) * b);
                System.out.print(calculation + " ");
            }
            System.out.println();
        }
        keyboard.close();
    }
}
//We need to insert like this
//2 enter
//0 2 10    //Here 0 start, power 2, and limit 10 to the for loop condition