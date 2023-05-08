package com.ap.practiceone;

public class Main {
    public static void main(String[] args) {
        Bill billObj = new Bill(10);
        System.out.println(billObj.itemPrice);
        billObj.display();
    }
}
