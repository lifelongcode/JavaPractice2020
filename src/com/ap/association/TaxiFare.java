package com.ap.association;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaxiFare {

    public static void main(String[] args) {
        YellowTaxi yt = new YellowTaxi("Yellow Cab Rate", 45.75);
        Uber ut = new Uber("Uber Rate", 55.45);
        GreenCab gct = new GreenCab("Green Cab Rate", 41.95);

        //Example of association
        System.out.println("Elmhurst to JFK airport fare " + "\n" + yt.getTaxiName() + " $" + yt.getYellowFare()
                + "\n" + ut.getUberTaxi() + " $" + ut.getUberRate()
                + "\n" + gct.getGcTaxi() + " $" + gct.getGcRate());



        // Let's check how much money you want to spend the Trip Elmhurst to JFK airport
        //According to your budget we can suggest your perfect ride.

        System.out.println("Please Enter the money you want to spend for Cab Ride Elmhurst to JFK airport");
        Scanner keyboard = new Scanner(System.in);
           // double input = Double.parseDouble(keyboard.nextLine());

        //Also, we like to use here use Exception, for example user certainly put wrong number or
        // w10, so program will not crash. It will say. Hey you put wrong input.
        try {
            double input = Double.parseDouble(keyboard.nextLine());
            if((input >= yt.getYellowFare()) && (input <ut.getUberRate()))
                System.out.println("You can take Yellow Taxi as new Yorker");
            else if (input >= ut.getUberRate())
                System.out.println("You are welcome to take UBER or Luxury Service");
            else if ((input >= gct.getGcRate()) && (input < yt.getYellowFare()))
                System.out.println("You can take Green Cab");
            else {
                System.out.println("Try MTA Bus or Train");
            }
        }catch(NumberFormatException exe){
            System.out.println("Not correct Input, Please Enter the money ");
        }

    }
}
