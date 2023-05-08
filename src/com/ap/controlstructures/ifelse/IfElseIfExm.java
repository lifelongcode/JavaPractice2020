package com.ap.controlstructures.ifelse;

public class IfElseIfExm {
    public static void main(String[] args) {
        String customerType = "Regular";
        int quantity = 3;
        int unitPrice = 12;
        int discount = 5;
        int deliveryCharge = 5;
        int totalCost = unitPrice * quantity;

        //If Else if logic below
        if (customerType == "Regular") {
            totalCost = totalCost - (totalCost * discount / 100);
            System.out.println("You are regular customer and eligible for 5% discount");
            System.out.println("The Total Cost to be paid is " + totalCost);
        }else if(customerType == "Guest"){
            totalCost = totalCost + deliveryCharge;
            System.out.println("You need to pay an additional delivery charge of $5");
            System.out.println("The Total Cost to be paid is " + totalCost);
        }else // if there is only one statement inside a block,m {} is optional
            System.out.println("Invalid customer type");


        System.out.println("--------------------------");
        int marks = 95;

        if(marks < 50){
            System.out.println("Fail");
        } else if(marks >=50 && marks <= 60){
            System.out.println("D grade");
        } else if(marks >= 60 && marks <= 70){
            System.out.println("C grade");
        } else if(marks >= 70 && marks <=80){
            System.out.println("B grade");
        } else if(marks >= 80 && marks <=90){
            System.out.println("A grade");
        } else if(marks >= 90 && marks <=100){
            System.out.println("A+ grade");
        } else{
            System.out.println("Invalid");
        }

    }
}
