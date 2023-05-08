package com.ap.interfacemethod;

public class Main implements Pen{

    @Override
    public String colorPen() {
        return Pen.super.colorPen();
    }
}
