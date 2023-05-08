/**
 This program uses 3 important java String built-in methods
 1. compareTo()
 2. substring()
 3. toUpperCase()
 */

package com.ap.hackerrank13;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Please Enter hello for A " + "\n Enter java for B");
        Scanner keyboard = new Scanner(System.in);
        String A = keyboard.next();
        String B = keyboard.next();

        System.out.println(A.length() + B.length());
        int index = A.compareTo(B);
        System.out.println(index);
        if(index > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        String aChange = A.substring(0,1).toUpperCase()+A.substring(1);
        String bChange = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(aChange + " " + bChange);
    }
}
