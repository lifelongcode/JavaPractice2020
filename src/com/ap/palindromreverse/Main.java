/**
 This is the program find the palindrome.
 Also user input number even though it is not palindrome
 it will make calculate (in our case adding number) unless it becomes palindrome
 */
package com.ap.palindromreverse;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ReversePalindrome rp = new ReversePalindrome();
        int userInput;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter integer to see it is palindrome or not");
        userInput = keyboard.nextInt();
        //Just like to see how reverse method works
        //System.out.println(rp.reverseNum(userInput));
        //      System.out.println(rp.isPalindrome(userInput));
        //    System.out.println(rp.reverseNum(userInput));

        //above case does not have condition at least one time
        int count = 0;
        do {
            //before checking the condition at least run 1 time
            userInput += rp.reverseNum(userInput);
            count++;

        } while (!rp.isPalindrome(userInput));
        System.out.println(userInput);
        //also, we can see how many times reverse its adding
        //optional to show the display how many times reverse the original input
        System.out.println(count);

        System.out.println(9%10);


    }
}
