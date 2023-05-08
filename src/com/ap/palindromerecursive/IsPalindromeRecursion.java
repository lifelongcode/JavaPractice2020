/**
 * This is the simple java program to find the string is palindrome or not
 * The algorithm is recursive
 */

package com.ap.palindromerecursive;

//Recursive method to find the palindrome

public class IsPalindromeRecursion {
    public boolean isPal(String str) {
        if (str.length() == 0 || str.length() == 1)
            return true;
        // Now we are going to string char to check
        //Example racecar         index r is 0, and last char of the string is (str.length()-1) = r
        //after that it will go recursive call
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return isPal(str.substring(1, str.length() - 1));
        return false;
    }
}
