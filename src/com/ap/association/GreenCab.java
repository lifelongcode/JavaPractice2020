package com.ap.association;

public class GreenCab {
    private String gcTaxi;
    private double gcRate;

    public GreenCab(String gcTaxi, double gcRate) {
        this.gcTaxi = gcTaxi;
        this.gcRate = gcRate;
    }

    public String getGcTaxi() {
        return gcTaxi;
    }

    public void setGcTaxi(String gcTaxi) {
        this.gcTaxi = gcTaxi;
    }

    public double getGcRate() {
        return gcRate;
    }

    public void setGcRate(double gcRate) {
        this.gcRate = gcRate;
    }
}
