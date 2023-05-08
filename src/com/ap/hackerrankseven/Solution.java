package com.ap.hackerrankseven;

import java.util.Scanner;

public class Solution {
    static int B, H;
    static boolean flag = true;
    static{
        Scanner keyboard= new Scanner(System.in);
        //This is they way we can take two inputs from the keyboard.
        //Before declare the variable
        //later on with Scanner assign the values
        B = keyboard.nextInt();
        H = keyboard.nextInt();

        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }
    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
