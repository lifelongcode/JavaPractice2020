package com.ap.hackerrankfive;

import java.util.Scanner;

public class VehicleChooseByFuel {

    public static void main(String[] args) {
        Car suv = new SUV();
        Car myCar = new Car();
        System.out.println("Enter what fuelType you have ");
        Scanner keyboard = new Scanner(System.in);
        String fuelReserve = keyboard.nextLine();

        if(fuelReserve.equals("Petrol")){
            myCar.fuelType();
            System.out.println("You may take Car.");
        }else if(fuelReserve.equals("Diesel")){
            suv.fuelType();
            System.out.println("You may take SUV type Vehicle.");
        }else{
            if(fuelReserve.equals("Charging")){
                System.out.println("Sorry we do not have the vehicle type yet.");
            }
            System.out.println("Do not have it.");
        }
    }
}
