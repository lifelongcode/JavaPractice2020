package com.ap.hackerrankfive;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        for(int i =0; i<2; i++){
            String input = keyboard.nextLine();
            Car suv = new SUV();
            System.out.println("Enter what fuelType you have ");
            String fuelReserve = keyboard.nextLine();

            if(fuelReserve.equals("Petrol")){
                suv.fuelType();
            }


            if(input.equals("topSpeed")){
                suv.topSpeed();
            }

            if(input.equals("fuelType")){
                suv.fuelType();
            }

            Car myCar = new Car();
            if(input.equals("topSpeed")){
                myCar.topSpeed();
            }
            if(input.equals("fuelType")){
                myCar.fuelType();
            }

        }
    }
}
