package com.ap.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
    This is the simple program stores mappings in a HashMap and rhen
    searches for various object.
 */

public class CarHashMap {

    public static void main(String[] args) {
        //Let's create a hashMap to store Car objects.
        Map<String, Car> carMap = new HashMap<>();

        //creating some Car objects
        Car vw = new Car("227H54", "1997 Volkswagen");
        Car mustang = new Car("44BA69", "1965 Mustang");
        Car porsche = new Car("453B55", "2007 Porsche");
        Car bmw = new Car("44BA69", "1965 Mustang");

        //Now we are going to Put some mappings into the HashMap. In ech
        //mapping, the car VIN is the key and the car object
        //containing that VIN is the value
        carMap.put(vw.getVin(), vw);
        carMap.put(mustang.getVin(), mustang);
        carMap.put(porsche.getVin(), porsche);
        carMap.put(bmw.getVin(), bmw);

        //Search for the Mustang by its VIN.
        System.out.println("\nSearching for the car with "+"VIN " + mustang.getVin());
        Car foundCar = carMap.get(mustang.getVin());
        //If the car was found, display it.
        if(foundCar !=null){
            System.out.println(foundCar);
        }else{
            System.out.println("The Mustang is NOT in the set.");
        }

        //Another car search
        System.out.println("\nSearching for the car with"+"VIN 911C87");
        foundCar = carMap.get("911C87");
        if(foundCar !=null){
            System.out.println(foundCar);
        }else{
            System.out.println("The Car is NOT in the set.");
        }

    }
}
