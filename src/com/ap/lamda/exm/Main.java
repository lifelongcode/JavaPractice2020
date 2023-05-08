package com.ap.lamda.exm;

//Example before lambda uses

public class Main {

    public static void main(String[] args) {
        //First Example is required to create another class which is
        //implements Runnable Interface.
        //One way to do that
       // new Thread(new CodeToRun()).start();

        //Next way we can do anonymous class method
        /**
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hey You are printing from Runnable");
            }
        }).start();

         **/

        //Now using Lambda expression to do that more easy way
        new Thread(() -> System.out.println("Printing from the Runnable")).start();

        System.out.println("------------------------");

        new Thread(() -> {
            System.out.println("Printing from the Runnable");
            System.out.println("This is Second Lined");
            System.out.format("This is the line%d\n", 3);
        }).start();

    }
}

class CodeToRun implements Runnable{

    @Override
    public void run(){
        System.out.println("Printing from the Runnable");
    }
}

/**
    Evert Lambda expression got 3 parts:
    First Part is taken "Argument list"     ()
    Second Part is taken "Array Token"       ->
    Third Part is taken "Body"              (" ")
 */