package com.ap.interfacemethod;

public class RunMain {

    public static void main(String[] args) {

        System.out.println("Let's test the interfaces ");
        //Now if I create an object will be working or not
        // because this object has interfaces with full method
        Main nM = new Main();

        System.out.println(nM.colorPen());
    }
}
