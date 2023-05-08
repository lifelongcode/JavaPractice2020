package com.ap.controlstructures.ifelse;

public class IfExm {
    public static void main(String[] args) {
        String customerType = "Regular";
        int quantity = 2;
        int unitPrice = 10;
        int totalCost = 0;
        int disocunt = 5;
        totalCost = unitPrice * quantity;

        //If logic here
        if(customerType == "Regular"){
            totalCost = totalCost - (totalCost * disocunt / 100);
            System.out.println("You are a regular customer and eligible for 5% discount");
        }
        System.out.println("Total Cost: " + totalCost);
    }
}
