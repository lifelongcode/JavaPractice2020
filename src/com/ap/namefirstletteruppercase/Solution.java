package com.ap.namefirstletteruppercase;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Please enter your first name");
        Scanner keyboard = new Scanner(System.in);

        String firstName = keyboard.next();

        String name = firstName.substring(0,1).toUpperCase()+firstName.substring(1);

        System.out.println("Now you can see your first name modified to \n" + name);
    }
}
