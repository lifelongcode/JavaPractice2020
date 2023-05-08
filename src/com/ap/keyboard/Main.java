package com.ap.keyboard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer ");

        int input = keyboard.nextInt();

        UsingWhileLoop wl = new UsingWhileLoop();
        wl.makeSum(input);

        System.out.println("--------------------------------------");
        UsingForLoop fl = new UsingForLoop();
        fl.makeSumFromInt(input);


    }


}
