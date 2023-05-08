package com.ap.controlstructures.dowhile;
import java.util.Scanner;

public class WhileExm {

    public static void main(String[] args) {
        //Creating a Scanner object
        Scanner keyboard = new Scanner(System.in);
        int totalCost = 0;
        char wanToAddFoodItem = 'Y';
        int unitPrice = 15;
        int quantity = 1;

        while(wanToAddFoodItem == 'Y'){
            totalCost = totalCost + (quantity * unitPrice);
            System.out.println("Ordered placed successfully");
            System.out.println("Total Cost: " + totalCost);
            System.out.println("Do you want to add more food items to your order?  Y or N" );
            String input = keyboard.next();
            wanToAddFoodItem = input.charAt(0);
        }
    }

}
