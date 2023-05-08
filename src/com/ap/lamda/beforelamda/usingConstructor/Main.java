package com.ap.lamda.beforelamda.usingConstructor;

public class Main {


     public static void main(String[] args) {

         BeforeLambdaExm beforeLambdaExm = new BeforeLambdaExm();

         System.out.println(beforeLambdaExm.doSomeOperation(3, 9,"subtract"));

         System.out.println("Result is " + beforeLambdaExm.doSomeOperation(10,9, "multiply"));
      }
}
