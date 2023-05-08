package com.ap.collectionExc.theatreproject;

public class Main {
    public static void main(String[] args) {
        Theatre myTheatre = new Theatre("Lotus", 7, 12);
        myTheatre.getSeats();

        if(myTheatre.reserveSeat("B10")){
            System.out.println("Please Pay Now..");
        }else {
            System.out.println("Sorry, seat is taken");
        }

        System.out.println();
        //Let's try again, so that it will say Sorry, seat is taken
        if(myTheatre.reserveSeat("B10")){
            System.out.println("Please Pay Now..");
        }else {
            System.out.println("Sorry, seat is taken");
        }

    }
}
