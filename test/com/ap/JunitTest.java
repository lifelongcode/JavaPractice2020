package com.ap;

public class JunitTest {

    public int quotient(int x, int y){
        if(y==0){
            throw new IllegalArgumentException("Y can not be zero");
        }
        return x/y;
    }
}
