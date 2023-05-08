package com.ap.controlstructures.ifelse;

public class NestedIfExm {
    public static void main(String[] args) {
        String customerType = "Guest";
        int quantity = 3;
        int unitPrice = 11;
        int totalCost = 0;
        int discount = 5;
        int deliveryCharge = 5;
        totalCost = (unitPrice * quantity);

        //Nested if logic below
        if (customerType == "Regular") {
            totalCost = totalCost - (totalCost * discount / 100);
            System.out.println("You are regular customer and eligible for 5% discount");
            System.out.println("The Total Cost to be paid is " + totalCost);
            if (totalCost >= 20) {
                System.out.println("Wow! You have got a gift voucher!");
            }
        } else if (customerType == "Guest") {
            totalCost = totalCost + deliveryCharge;
            System.out.println("You need to pay an additional delivery charge of $5");
            System.out.println("The Total Cost to be paid is " + totalCost);
        } else // if there is only one statement inside a block,m {} is optional
            System.out.println("Invalid customer type");


        System.out.println("--------------------------");
    }
}
