package com.ap.ikmtest;

public class ExceptionTest {
    public static void main(String[] args) {
//

        ExceptionTest testClass = new ExceptionTest();
        testClass.doProcessing();


    }

    public void doProcessing(){
        doNewProcessing();
    }

    private void doNewProcessing(){
        System.out.println("New processing done");
    }
}
