/**
     This is the simple program that is loop that you will see is
    do-while.
    When the loop has to be executed at least once before the condition is checked,
    do-while is used. After the first execution, the loop then gets
    repeated as long as the condition is true. In case of do-while loop, the condition
    is tested after executing the code bock.
    Hence, it is called an exit-controlled loop.
    Syntax:
    do {
        <statement>;
    } while(<condition>);

 */
package com.ap.controlstructures.dowhile;

import java.util.Scanner;

public class DoWhileExm1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalCost = 0;
        char wantToAddFoodItem = 'N';
        int unitPrice = 13;
        int quantity = 1;

        do{
            totalCost = totalCost + (quantity * unitPrice);
            System.out.println("Order placed successfully!");;
            System.out.println("Total Cost: " + totalCost);
            //Giving option customer to add more food
            System.out.println("Do you want to add more food items to the order? Y or N ");
            String input = keyboard.next();
            wantToAddFoodItem = input.charAt(0);

        } while(wantToAddFoodItem == 'Y');
        System.out.println("Thank you for the order. It will be ready soon! ");

    }


}
