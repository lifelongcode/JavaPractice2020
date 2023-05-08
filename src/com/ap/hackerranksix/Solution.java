package com.ap.hackerranksix;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i =1;

        while(keyboard.hasNext()){
            String takeString = keyboard.nextLine();
            System.out.println(i + " " + takeString);
            i++;
        }
        keyboard.close();
    }
}
