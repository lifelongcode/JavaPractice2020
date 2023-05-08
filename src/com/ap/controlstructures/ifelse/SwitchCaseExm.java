package com.ap.controlstructures.ifelse;

import java.util.Scanner;

public class SwitchCaseExm {
    public static void main(String[] args) {

        String[] menu = {"Vanilla", "Chocolate", "Rainbow", "ButterPecan", "Cherry"};
        System.out.println("Take a look Today's Menu: ");
        for (String dailyMenu: menu) {
            System.out.print(dailyMenu + ", ");
        }
        System.out.println(" ");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type Which you like today: ");
        String like = keyboard.nextLine();
        //String orderedFood = "Pizza";
        switch (like){
            case "Vanilla":
                System.out.println("You have ordered " + like + " Unit price: $6");
                break;
            case "Chocolate":
                System.out.println("You have ordered " + like + " Unit price: $7");
                break;
            case "Rainbow":
                System.out.println("You have ordered " + like + " Unit price: $8");
                break;
            case "Cherry":
                System.out.println("You have ordered " + like + " Unit price: $3");
                break;
            case "ButterPecan":
                System.out.println("You have ordered " + like + " Unit price: $5");
                break;
            default:
                System.out.println("Invalid Selection.");
        }
    }
}
