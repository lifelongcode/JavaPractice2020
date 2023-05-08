package com.ap.gaddispennyproblem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args) {
        int pennies;
        int totalPay;
        int maxDays;
        int dayCount;

        Scanner keyboard = new Scanner(System.in);
        //Get the maximum number od days
        System.out.println("For how many days you will work? ");
        maxDays = keyboard.nextInt();

        //Validate the input
        while (maxDays < 1){
            System.out.println("The number of days must be at least 1 ");
            System.out.print("Enter the number of days: ");
            maxDays= keyboard.nextInt();
        }

        //Initialize the day counter to day 1
        dayCount = 1;

        //Initialize the penny accumulator for the
        //first day at work
        pennies = 1;

        //Initialize the total pay accumulator
        totalPay=0;

        //Display the report header
        System.out.println();
        System.out.println("Day\t\tPennies Earned");
        System.out.println("----------------------------------------");

        //Display the income report
        while(dayCount <= maxDays){
            //Display the day number and pennies earned
            System.out.println(dayCount + "\t\t" + pennies);
            totalPay +=pennies;

            //Increment dayCount for the next day
            dayCount++;

            //Important calculation which is going to multiplication by 2
            //Here specifically says double
            pennies *= 2;
        }

        //Create a DecimalFormat Object to format output.
        DecimalFormat dollar = new DecimalFormat("#, ##0.00");
        //Now time to display the total pay
        System.out.println("Total pay: $" + dollar.format(totalPay /100.00));
    }
}
