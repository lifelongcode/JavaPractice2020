package com.ap.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions likeDimensions = new Dimensions(20, 20, 5);
        Case theCaseYouLike = new Case("220B", "Dell", "240" , likeDimensions);

        //We can create inside new object if it has other new object taken.
        Monitor likeMonitor = new Monitor("27inch Beast", "HP", 27,
                                            new Resolution(2540, 1440));

        Motherboard likeMotherboard = new Motherboard("BJ-200", "Dell",
                                                    4, 6, "v2.44");


        PC yourPC = new PC(theCaseYouLike, likeMonitor, likeMotherboard);

        //How do we access Monitor drawPixelAt method??
        yourPC.powerUp();

        //Above is called composition
    }
}
