package com.ap.keyboard;

public class UsingWhileLoop {

    public void makeSum(int number){
        int temp = number;
        int sum=0;
        while(temp > 0){
            int remainder = temp % 10;
            sum += remainder;
            temp /=10;
        }
        System.out.println("Sum " + sum);
    }
}
