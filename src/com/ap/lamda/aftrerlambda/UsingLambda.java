package com.ap.lamda.aftrerlambda;


import java.util.Scanner;
public class UsingLambda{

    public static void main(String[] args) {

        //creating lambda expression
        Operation adder = (double x, double y)-> x + y;

        //executing lambda expression
        double result = adder.calculations(3,4);

        //print the result
        System.out.println(result);

        Operation subtract = (double x, double y)-> x - y;
        double resultSub = subtract.calculations(7,2);
        System.out.println(resultSub);


        Operation mul = (double x, double y)-> x * y;
        double resultMul = mul.calculations(100,2);
        System.out.println(resultMul);

        Operation div = (double x, double y)-> x / y;
        double resultDiv = div.calculations(100,4);
        System.out.println(resultDiv);



    }



}
