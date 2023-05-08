package com.ap.reverseinterger;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int num = 195;
        int temp = num;
        //If we want we can count after how many times it gets the palindrome
        int count = 0;
        ReverseInteger reverseInteger = new ReverseInteger();

        while(!reverseInteger.isPalindrome(num)){
            temp += reverseInteger.reverseIt(num);
            count++;
            num = temp;
        }
        System.out.println("Now We can catch the number which is Palindrome "+num
                            + "\nIt takes " + count + " times iteration.");



        //check

        System.out.println(reverseInteger.reverseIt(195));;

        //check module calculation

        //1st iteration
        System.out.println((0*10) + (195%10));  //5

        //2nd iteration
        System.out.println((5*10) + (19%10)); //199

        //3rd iteration
        System.out.println((59*10) + (1%10));  // 11

        System.out.println(" ----------------------------");


        //Palindrome iteration
        //1sr iteration
        System.out.println(num = 195 + 591);
        System.out.println(195+ (reverseInteger.reverseIt(195))) ;

        //2nd iteration
        System.out.println(num = 786 + 687);
        System.out.println(786+ (reverseInteger.reverseIt(786))) ;

     //   3rd iteration
        System.out.println(num = 1473 + 3741);
        System.out.println(1473+ (reverseInteger.reverseIt(1473))) ;

     // 4th iteration
        System.out.println(num = 5214 + 4125 );
        System.out.println(5214 + (reverseInteger.reverseIt(5214)));

        // Now we stop the while loop because we find our desired value which is Palindrome.

    }
}
