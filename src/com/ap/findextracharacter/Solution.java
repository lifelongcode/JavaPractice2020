package com.ap.findextracharacter;

public class Solution {
    public static char findExtraCharacter(char[] strA, char[] strB){
        //You want to know why 256 because 8 bit
                                    //You want to know what is 8 bit
                                    //here you go.
                                    //A   65  = 01000001
                                    //Now You have to know binary representation

        //store string values in map1 as array of integer
        int[] map1 = new int[256];

        //store second string in map with frequency
        for(int i=0; i<strB.length; i++)
            map1[strB[i]]++;

        for(int i=0; i<strA.length; i++)
            map1[strA[i]]--;

        for(int i=0; i<map1.length; i++){
            //if the frequency is 1 then this
            //character is which is added extra
            if(map1[i] == 1)
                return (char) i;
        }
        return Character.MIN_VALUE;
    }


    public static void main(String[] args) {
        //given string
        String myStringA= "abcd";
        String myStringB= "cbdaf";
        //using the method to find it
        //inside the arguments myStringA converting and taking an argument as well as myStringB
        System.out.println(findExtraCharacter(myStringA.toCharArray(), myStringB.toCharArray()));
    }
}


/**
    Some thought behind how the program work
    map1 array first added all myStringB
    since we use
    int[] map1 = new int[256];
    our concern is that we are going to add ASCII value
    8 bit
    a = 97 = 1100001
    b = 98 = 1100010
    c = 99 = 1100011
    d =100 = 1100100
    f =102 = 1100110

    then subtracting all the myStringA
     a = 97 = 1100001
     b = 98 = 1100010
     c = 99 = 1100011
     d =100 = 1100100

    then we can check conditional statement to the map1
    using for loop
    must be there f =102 = 1100110
    if(map1[i] == 1)
    return (char) i;
        //So, there is 8 bit 1100110 1 is existing so, it will print out f
    //but the question how?
 //It will find 1 1 1 1 1 1 11 1 1 1  11 1  1 til 102
 //when it finished. so that it can be print f



 */