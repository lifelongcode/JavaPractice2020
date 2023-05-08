package com.ap.practicetest;

public class Derived extends Base{
    private int fun(){
        return 1;
    }

    public int run(){
        return fun();
    }
}
