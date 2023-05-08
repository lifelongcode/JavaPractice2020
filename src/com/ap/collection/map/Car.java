package com.ap.collection.map;

/**
    This is the simple Car class stores a vin and a description for a car.
 */
public class Car {

    private String vin;
    private String description;

    public Car(){
    }

    public Car(String vin, String description) {
        this.vin = vin;
        this.description = description;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //Override toString method
    @Override
    public String toString(){
        return "VIN:"+vin
                + "\tDescription:"
                +description;
    }
    /**
        hashCode method
        @return A has code for this car
     */
    public int hashCode(){
        return vin.hashCode();
    }

    //equal method
    //@param obj Another object to compare this object to.
    //@return true if the two objects are equal, false otherwise
    public boolean equals(Object obj){
        //make sure the other object is a Car
        if(obj == null || !(obj instanceof Car)){
            return false;
        }else{
            //Both are cars: Fet a reference to other object as a car and check if their VIN
            //numbers are the same.
            Car tempCar = (Car) obj;
            return vin.equalsIgnoreCase(tempCar.vin);
        }

    }
}


