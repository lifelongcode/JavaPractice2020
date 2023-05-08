package com.ap.dependencyinjection;

//Bean class has loosely coupled with Cat and Doc class
public class Bean {

    public Bean(){
    }

    //Animal
    private Animal animal;

    Bean(Animal animal){
        this.animal=animal;
    }

    public void shout(){
        animal.makeNoise();
    }

}
