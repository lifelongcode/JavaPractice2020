package com.ap.practicetest;

public class Tester {

    public static void main(String[] args) {
//        Base baseRef = new Derived1();
//
//        System.out.println(baseRef.run());
//
//
//        int[] tempList={1, -1, -2};
//        int[] numList={-2, -1, 1};
//        int length = numList.length;
//
//        for (int value:tempList) {
//            int tempValue = value;
//            if(value<0){
//                tempValue = length - Math.abs(value);
//            }else{
//                numList[tempValue] = value;
//
//            }
//
//        }
//        else{
//            numList[0] = value;
//        }
//        }

        for(int loop =0; loop<5; loop++){
            if(loop >2 ){
                continue;
            }
            if(loop >4){
                break;
            }
            System.out.println(loop);
        }
    }
}
