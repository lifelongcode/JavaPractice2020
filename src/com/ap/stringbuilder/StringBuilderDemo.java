package com.ap.stringbuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String  palindrome = "Dot saw I was Tod";
        int len = palindrome.length();

        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        //put original string in an array of chars
        for(int i =0; i< len; i++){
            tempCharArray[i] = palindrome.charAt(i);
        }

        //reverse array of chars
        for(int j=0; j< len; j++){
            charArray[j] = tempCharArray[len - 1 - j];
        }

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);

    }
}

/**
 If you convert the palindrome string to a string builder,
 you can use the reverse() method in the StringBuilder class.
 It makes the code simpler and easier to read:
 Note, It is just a String.
 Array of String. I have different programme - palindrome from array
 */

/**
    public class StringBuilderDemo{
    public static void main(String[] args){
    String palindrome = "Dot saw I was Tod";

    StringBuilder sb = new StringBuilder(palindrome);
    sb.reverse(); //reverse it

    //now you can print out
    System.out.println(sb);



 }
 }

 Note that println() prints a string builder, as in:
 System.out.println(sb);
 because sb.toString() is called implicitly,
 as it is with any other object in a println() invocation.
 */