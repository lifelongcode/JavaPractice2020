/**
 This is the simple program will reverse the user input number
 For example user input 179, it will print out 971.
 That's the method does. Also another method which will check isPalindrome or not
 */

package com.ap.reverseinterger;

public class ReverseInteger {

    //method to reverse integer
    public int reverseIt(int number){
        //int temp = number;
        int result = 0;
        while(number > 0){
            result = (result * 10) + number % 10;
            number /= 10;
        }
        return result;
    }

    //Method to check whether it is Palindrome or not
    public boolean isPalindrome(int input){
        int temp = input;
        int result = 0;
        while (temp > 0){
            result = (result * 10) + temp % 10;
            temp /= 10;
        }
        //now logic here after reversing the integer now times to check
        if(result == input){
            return true;
        }else{
            return false;
        }
    }

}
