package com.ap.withoutmultiplybutmultiply;

public class MultiplyWithoutMultiplication {

    //this is the method multiply two numbers a and b
    public int multiply(int a, int b){
        //base case scenario
        // 0 multiplied with anything gives result is 0
        if(b == 0)
            return 0;
        /**
         The logic is here Add a one by one until the b's length reach 0,
         that is recursive call.
         What it does it will subtract 1 by 1
         */
        if(b > 0)
            return (a +  multiply(a, b-1));
        //if the case where b is negative
        if(b < 0)
            return -multiply(a, -b);
        return -1;
    }

}
