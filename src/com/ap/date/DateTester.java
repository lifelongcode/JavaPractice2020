package com.ap.date;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTester {
    public static void main(String[] args) {
        LocalDate local = LocalDate.of(2020,1,1);
        local = local.minusMonths(-5);
        local = local.minusDays(9);
        System.out.println(local);


        String strMy = "Infosys Certified Java Programmer Mock";
        String strUpdated = strMy.trim().substring(6,7)+strMy.trim().substring(37);
        System.out.println(strUpdated);

        StringBuffer strBuff = new StringBuffer("null");
        StringBuilder strBul = new StringBuilder("null");
        String str = new String();
        str = "null";

        System.out.println(str.equals(strBul) + " ");
        System.out.println(strBul.equals(strBuff)+ " ");
        System.out.println(strBul.equals(str));

        m1(20,20);


        System.out.println("Enter the size ");
        Scanner keyboard = new Scanner(System.in);
        int arraySize = keyboard.nextInt();
        String names = keyboard.next();
        String heights = keyboard.next();

        String[] persons = new String[arraySize];
        for(int i=0; i<persons.length; i++){
            persons[i] = names;
            System.out.println(persons[i]);
        }

        String[] tall = new String[arraySize];
        for(int i=0; i<tall.length; i++){
            tall[i]= heights;
            System.out.println(tall[i]);
        }

    }

    public static void m1(int i, float f){
        System.out.println("int float method");
    }


}
