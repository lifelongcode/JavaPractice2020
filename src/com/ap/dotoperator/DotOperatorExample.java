package com.ap.dotoperator;
import java.lang.Integer;

public class DotOperatorExample {
    public void show(){
        int i = 97;
        System.out.println("In show method " + i);
    }

    public boolean isGreater(int numOne, int numTwo){
        if (numOne > numTwo){
            return true;
        }else{
            return false;
        }
            //Just simple line compare will result same
            //        return numOne > numTwo;

    }

}
