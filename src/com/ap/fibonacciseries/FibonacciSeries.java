package com.ap.fibonacciseries;

public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 15;
        int[] fibonacci = new int[count];
        fibonacci[0] =0;
        fibonacci[1] =1;

        for(int x=2; x<count; x++){
            fibonacci[x] = fibonacci[x-1] + fibonacci[x-2];
        }

        for(int x=0; x<count; x++){
            System.out.println(fibonacci[x] + " ");
        }
    }
}
