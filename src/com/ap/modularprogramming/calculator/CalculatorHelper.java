package com.ap.modularprogramming.calculator;

/**
    This class is only for Inter use.
    should be used inside "com.ap.modularprogramming.calculator" package ONLY!
    Hence, the access specifier of this class is set to "default"
 */
public class CalculatorHelper { //Declaring the class CalculatorHelper as default
    public int calcHelper(int sal, int hike){
        return (int)(sal + (sal * hike * 0.01));
    }


}

