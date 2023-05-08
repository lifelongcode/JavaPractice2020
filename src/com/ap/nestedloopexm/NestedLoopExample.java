package com.ap.nestedloopexm;

public class NestedLoopExample {

    public static int numIntsInCommon(int[] picks){
        int inCommon =0;
        int[]lotteryNumber={1, 4, 6, 7,5,6,7,8,8,8,7};
        for(int counter = 0; counter <10; counter++){
            for(int index =0; index<10; index++){
                if(lotteryNumber[counter] == picks[index])
                    inCommon++;
            }
        }
        return inCommon;
    }

    public static void main(String[] args) {
        int[] num={5,3,4,5,6,6,7,7,2,1};
        System.out.println(numIntsInCommon(num));

    }
}
