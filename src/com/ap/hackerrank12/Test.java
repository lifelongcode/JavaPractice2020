package com.ap.hackerrank12;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Please Enter Integer to see international currency style ");
        Scanner keyboard = new Scanner(System.in);
        double payment = keyboard.nextDouble();
        keyboard.close();

        NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usa.format(payment);

        NumberFormat ukStyle = NumberFormat.getCurrencyInstance(new Locale("en", "GB"));
        String uk = ukStyle.format(payment);

        NumberFormat indiaStyle = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = indiaStyle.format(payment);

        NumberFormat chinaStyle = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaStyle.format(payment);

        NumberFormat franceStyle = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceStyle.format(payment);

        NumberFormat italianStyle = NumberFormat.getCurrencyInstance(Locale.ITALY);
        String italy = italianStyle.format(payment);

        NumberFormat banglaStyle = NumberFormat.getCurrencyInstance(new Locale("en", "BD"));
        String bangladesh = banglaStyle.format(payment);

        System.out.println("US: " + us);
        System.out.println("UK: " + uk);
        System.out.println("France: "+ france);
        System.out.println("Italy: " + italy);
        System.out.println("China: " + china);
        System.out.println("India: "+ india);
        System.out.println("Bangladesh: "+ bangladesh);

    }

}
