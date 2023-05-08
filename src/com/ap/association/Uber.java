package com.ap.association;

public class Uber {
    private String uberTaxi;
    private double uberRate;

    public Uber(String uberTaxi, double uberRate) {
        this.uberTaxi = uberTaxi;
        this.uberRate = uberRate;
    }

    public String getUberTaxi() {
        return uberTaxi;
    }

    public void setUberTaxi(String uberTaxi) {
        this.uberTaxi = uberTaxi;
    }

    public double getUberRate() {
        return uberRate;
    }

    public void setUberRate(double uberRate) {
        this.uberRate = uberRate;
    }
}
