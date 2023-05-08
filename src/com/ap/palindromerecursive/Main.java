package com.ap.palindromerecursive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IsPalindromeRecursion isPalindromeRecursion = new IsPalindromeRecursion();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter the word to check it is palindrome or not ");
        String str = keyboard.nextLine();

        System.out.println(isPalindromeRecursion.isPal(str));
    }
}
