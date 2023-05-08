package com.ap.arrayparallel;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] id = {101,102,103,104,105};
        String[] names = {"Abraham", "Fred", "Jenifer", "August", "Parker"};
        //Also. we can add another array
        double[] salary = {87494.00, 68751.75,98458.10,65852.15,95000.00};

        System.out.println("Empployee Information: "+ "\nID \t  "+"Name \t\t"+"Salary");
        System.out.println("********************************");
        for(int i=0; i<id.length; i++){
            System.out.println(id[i] + " : " + names[i] + " "+salary[i]);
        }

        System.out.println("------------------------------");
        //example parallel sort
        Arrays.parallelSort(id);
        System.out.println(Arrays.toString(id));
    }
}
