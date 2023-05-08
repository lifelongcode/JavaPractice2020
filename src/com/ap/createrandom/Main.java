package com.ap.createrandom;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CreatingRandomUser ru = new CreatingRandomUser();
        String publicUserId = ru.generateUserId(8);
        String publicUserId1 = ru.generateUserId(8);

      //  System.out.println(publicUserId);
       // System.out.println(publicUserId1);

        int[] a = {4, 5, 9};
        int [] b ={1,2,3,8,10};

        int firstArray = a.length;
        int secondArray = b.length;
        int[] ints = new int[firstArray + secondArray];

        System.arraycopy(a, 0, ints, 0, firstArray);
        System.arraycopy(b, 0, ints, 0, secondArray);

        for(int element: ints){
            System.out.println(element+ " ");
        }

        //or we can do this way

        int position=0;
        //for each loop to add array1j elements to the resulting array
        for(int element: a){
            ints[position] = element;
            position++;
        }

        for(int element: b){
            ints[position] = element;
            position++;
        }

        System.out.println(Arrays.toString(ints));
     Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));
    }
}
