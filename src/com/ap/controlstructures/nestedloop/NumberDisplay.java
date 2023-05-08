/**
    As you know a nested loop is a loop within another loop, an inner loop within the body
    of an outer one.
 */

package com.ap.controlstructures.nestedloop;

public class NumberDisplay {
    public static void main(String[] args) {
        int rows = 10;
        for(int i =1; i <= rows; ++i){
            for(int j =1; j<=i; ++j){
                System.out.print(j + " " );
            }
            System.out.println("");
        }
    }

}
