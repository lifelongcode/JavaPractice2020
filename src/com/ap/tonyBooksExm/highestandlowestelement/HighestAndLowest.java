package com.ap.tonyBooksExm.highestandlowestelement;

public class HighestAndLowest<T extends Comparable<T>> {
    private T[] array;

    //Constructor
    public HighestAndLowest(T[] arr) {
        this.array = arr;
    }

    //method to find the lowest value
    public T getLowest(){
        T low = array[0];
        for(int k=1; k<array.length; k++){
            if(array[k].compareTo(low) < 0)
                low = array[k];
        }
        return low;
    }

    //method to find the highest value
    public T getHighest(){
        T highest = array[0];
        for(int k=1; k<array.length; k++){
            if(array[k].compareTo(highest) > 0)
                highest = array[k];
        }
        return highest;
    }
}
