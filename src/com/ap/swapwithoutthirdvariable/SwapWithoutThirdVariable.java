package com.ap.swapwithoutthirdvariable;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {

        int numberOne = 77;
        int numberTwo= 100;

        numberOne = numberOne + numberTwo; //177= 77+100
        numberTwo = numberOne - numberTwo; // -23 = 77-100
        numberOne = numberOne - numberTwo; // 100 = 77 - (-23)

        System.out.println("After swapping : " + " numberOne = " + numberOne + ", numberTWo= " + numberTwo );

        //As Usual, we do
        /**
        int temp =0;
        temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;
         */
    }
}
