/**
    As we know Methods used to obtain information about an object are known
    as accessor methods.
    One accessor method that you can use with strings is the length() method,
    which returns the number of characters contained in the string object.
    Here is the program is an example of length(), method String class.
 */

package com.ap.stringbufferandstringbuilder;

public class StringLength {
    public static void main(String[] args) {
        String palindrome =  "MadamIamadam";
        //Here we are calling util length() method to find the length of the String
        int len = palindrome.length();
        System.out.println(len);

        //Also previously we learn reverse method in StringBuffer lets check it is palindrome or not
        StringBuffer pl = new StringBuffer("madamiamadam");
        pl.reverse();
        System.out.println(pl);

    }
}
