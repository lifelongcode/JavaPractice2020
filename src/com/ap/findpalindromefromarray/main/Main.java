package com.ap.findpalindromefromarray.main;

import com.ap.findpalindromefromarray.method.FindPalindromeFromArray;

public class Main {
    public static void main(String[] args) {
        FindPalindromeFromArray fp = new FindPalindromeFromArray();

        int myArray[] = {1,  3,  7,  3,  1};
        int lengthOfMyArray = myArray.length;

        fp.palindrome(myArray, lengthOfMyArray);

        System.out.println("---------------------------------------------");

        int anotherArray[]={9,  3,  7,  4,  7};
        int n = anotherArray.length;

        fp.palindrome(anotherArray, n);

    }
}
