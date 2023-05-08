package com.ap.association;

public class YellowTaxi {
    private String taxiName;
    private double yellowFare;

    public YellowTaxi(String taxiName, double yellowFare) {
        this.taxiName = taxiName;
        this.yellowFare = yellowFare;
    }

    public String getTaxiName() {
        return taxiName;
    }

    public void setTaxiName(String taxiName) {
        this.taxiName = taxiName;
    }

    public double getYellowFare() {
        return yellowFare;
    }

    public void setYellowFare(double yellowFare) {
        this.yellowFare = yellowFare;
    }
}
