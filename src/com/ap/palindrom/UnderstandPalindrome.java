package com.ap.palindrom;

public class UnderstandPalindrome {

    public static boolean isPalindrome(int input){
        int temp = input;
        int result =0;
        while(temp > 0){
            result = (result * 10) + temp % 10;
            temp /= 10;
        }

        if(result == input){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.println(" The input is " + isPalindrome(101));
        System.out.println(" The input is " + isPalindrome(103));
    }
}
