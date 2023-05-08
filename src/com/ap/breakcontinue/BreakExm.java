package com.ap.breakcontinue;

public class BreakExm {

    public void printNumberBreak(){
        for(int i=0; i<10; i++){
            System.out.println(i);
            if(i == 4){
                break;
            }
        }
    }

    public void printNumberContinue(){
        for(int i=0; i<10; i++){

            if(i == 4){
                continue;
            }
            System.out.println(i);

        }
        System.out.println("This is will not printed when counter is 4");
    }
}
