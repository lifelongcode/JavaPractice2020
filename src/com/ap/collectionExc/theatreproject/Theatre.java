package com.ap.collectionExc.theatreproject;
import java.util.*;
public class Theatre {

    private final String theatreName;
    private List<Seat> thSeat = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows -1);
        for (char row= 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum<=seatsPerRow; seatNum++) {
                Seat mySeat = new Seat(row + String.format("%02d", seatNum));
                thSeat.add(mySeat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : thSeat) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }
    //For testing
    public void getSeats(){
        for(Seat seat: thSeat){
            System.out.println(seat.getSeatNumber());
        }
    }
}
