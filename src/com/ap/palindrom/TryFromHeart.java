package com.ap.palindrom;

public class TryFromHeart {
    //Suppose number = 12321;
    public boolean isPal(int number){
        int temp = number;
        int result = 0;

        while(temp >0){
            result = (result * 10) + (temp % 10);
            temp /= 10;
        }
        if(result == number){
            return true;
        }else{
            return false;
        }

    }
}
