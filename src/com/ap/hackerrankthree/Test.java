package com.ap.hackerrankthree;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();
        keyboard.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String result = "Weird";

        if (!(N % 2 == 0)) {
            result = "Weird";
        }
        if ((N % 2 == 0) && (N < 6) ) {
            result = "Not Weird";
        }
        if ((N > 6) && (N % 2 == 0) && (N <= 20) ) {
            result = "Weird";
        }

        if ((N % 2 == 0) && (N >20) ) {
            result = "Not Weird";
        }


        System.out.println(result);
        }

    }

