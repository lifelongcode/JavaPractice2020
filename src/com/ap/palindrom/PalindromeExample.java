package com.ap.palindrom;

import java.util.Scanner;

public class PalindromeExample {

    public static void main(String[] args) {
        //let's declare two String variables
        //concern here is original what ever user will input
        //another one we are going to reverse, therefore, reverse assign nothing onto it

        String original;
        String reverse= "";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter the String or Number to check it is Palindrome");

        original = keyboard.nextLine();
       int inputLength = original.length()-1;

       for(int i=inputLength; i>=0; i--)
            reverse = reverse + original.charAt(i);
            if(original.equals(reverse)){
                System.out.println("Your Input is Palindrome");
            }else{
                System.out.println("Your Input is NOT Palindrome");
            }
            keyboard.close();

    }

}

/*
//  Without, warning we can use StringBuilder
        String original;
        StringBuilder reverse= new StringBuilder();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the word to see is palindrome or not");
        original=keyboard.nextLine();
        int n = original.length()-1;

        for(int i=n; i>=0; i--)
            reverse.append(original.charAt(i));
        if(original.equals(reverse.toString())){
            System.out.println("Yes, your input is Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    keyboard.close();
 */

//Some palindrome words:
//redivide, deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, refer.