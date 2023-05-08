package com.ap.controlstructures.ifelse;

public class IfElseExm {
    public static void main(String[] args) {
        String customerType = "Regular";
        int quantity = 2;
        int unitPrice = 10;
        int totalCost = 0;
        int discount = 5;
        int deliveryCharge = 5;
        totalCost = unitPrice * quantity;

        //If logic here
        if(customerType == "Regular"){
            totalCost = totalCost - (totalCost * discount / 100);
            System.out.println("You are a regular customer and eligible for 5% discount");
        }else{
            totalCost = totalCost + deliveryCharge;
        }
        System.out.println("Total Cost: " + totalCost);

        //Another Example
        int number =5;
        if(number % 2 == 0){
            System.out.println(number + " is an even number.");
        }else{
            System.out.println(number + " is an odd number");
        }
    }
}
