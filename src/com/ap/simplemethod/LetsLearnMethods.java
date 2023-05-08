package com.ap.simplemethod;

/** Method type
 *
 *      //Static type method, because if it is static method,
 *      //in your main method do not need to create an object of the class.
        public static void hello(){
            System.out.println("Hello, Mr. ...");
         }


        //Regular method
         public void welcomeToMethod(){
            System.out.println("Welcome ");
         }
 */




public class LetsLearnMethods {


    public static void main(String[] args){

        //We can create object
       // LetsLearnMethods  nm = new LetsLearnMethods();


        //We are invoking the welcomeToMethods //or calling the method
      // nm.welcomeToMethod();

        //I can call the method without creating an object of the class
        welcomeToMethod();

    }


    //This is a void type method without taking any arguments
    public static void welcomeToMethod(){
        System.out.println("Welcome ");
    }
}
