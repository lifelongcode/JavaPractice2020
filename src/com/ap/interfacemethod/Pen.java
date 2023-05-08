package com.ap.interfacemethod;

public interface Pen extends Color{

    default String colorPen(){
        return "You have RED color pen";
    }


}
