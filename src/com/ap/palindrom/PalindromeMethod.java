package com.ap.palindrom;

public class PalindromeMethod {

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
