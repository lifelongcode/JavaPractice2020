package com.ap.hackerrankone;

import java.util.Scanner;

public class MyWay {
    public static void main(String[] args) {
        int[] myArray = {1,2,4,5,7,8,10,11};
       String result = "No";

        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();

        for(int i=0; i<myArray.length; i++){
            if(input == myArray[i]) {
                result = "yes";
                System.out.println(result);
//                break;
                if(input !=myArray[i]) {
                    result="No";
                    System.out.println(result);

                }
            }

        }

    }
}
