package com.ap.palindromreverse;

public class ReversePalindrome {

    public int reverseNum(int temp){
        int result = 0;

        while(temp > 0){
            result = (result * 10) + temp % 10;
            temp /= 10;
        }
        return result;
    }

    public boolean isPalindrome(int number){
        int temp = number;
        int result = 0;
        while(temp > 0){
            result = (result * 10) + temp % 10;
            temp /= 10;
        }
        if(result == number){
            return true;
        }else{
            return false;
        }
    }
}
