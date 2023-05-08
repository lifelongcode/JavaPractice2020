package com.ap.dependencyinjection;

import com.ap.collection.map.Car;

public class Main {

    public static void main(String[] args) {
        Bean jb = new Bean(new Cat());  //creating Bean object
                                        //new Bean, there should be Animal
                                        //then what animal. here is Cat
        jb.shout();

        System.out.println(" -------  --------------  ------------");

        Bean jd = new Bean(new Dog());
        jd.shout();

    }
}
