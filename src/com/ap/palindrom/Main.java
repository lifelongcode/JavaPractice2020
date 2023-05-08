package com.ap.palindrom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Please enter number to see it is palindrome or not");
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("How about lets check number: ");
//        int number = keyboard.nextInt();

        PalindromeMethod pm = new PalindromeMethod();
        System.out.println(pm.isPalindrome(101));

       TryFromHeart th = new TryFromHeart();
        System.out.println(th.isPal(12321));


    }

}
