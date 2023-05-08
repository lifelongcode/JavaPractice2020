package com.ap.referencetypevaluetype;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue= " + anotherIntValue);

        //let's change the value reference type
        anotherIntValue++;

        //Now we can see that both are not going change, only referenceOne change
        //Primitive type one didn't change
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue= " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 7;

        //Do they both array will update? Yes, because address pointing to the same array
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

    }
}
