package com.ap.palindromeusingstringbuilder;

import java.util.Scanner;

public class FindThePalindrome {

    public static void main(String[] args) {
        PalindromeMethod pm = new PalindromeMethod();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a string ");
        String input = keyboard.nextLine();

        System.out.println(pm.isPalindrome(input));
    }

}
