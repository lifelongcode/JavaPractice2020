package com.ap.palindromeusingstringbuilder;

public class PalindromeMethod {

    public boolean isPalindrome(String str){
        if(str == null)
            return false;
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);
        //It will return true or false

    }

}
