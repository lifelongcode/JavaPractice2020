package com.ap.keyboard;

public class UsingForLoop {

    public void makeSumFromInt(int num){
        int lengthOfNumber = Integer.toString(num).length();
        int sum = 0;
        for(int i=0; i<lengthOfNumber; i++){
            int remainderValue = num % 10;
            sum += remainderValue;
            num /= 10;
        }
        System.out.println("Sum " + sum);
    }
}
