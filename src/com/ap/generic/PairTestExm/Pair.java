package com.ap.generic.PairTestExm;

/**
    The Pair class demonstrates a generic class with two type parameters.
 */
public class Pair<T, S> {
    private T first;    //The first item
    private S second;   //The second item

    /**
        Constructor
        @param firstArg Assigned to the first item
        @param secondArg Assigned to the second item
     */

    /**    public Pair(T firstArg, S secondArg){
        first = firstArg;
        second = secondArg;
    }
     */
    //This is auto generated
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    //getFirst method
    public T getFirst(){
        return first;
    }

    //get second method
    public S getSecond(){
        return second;
    }


}
