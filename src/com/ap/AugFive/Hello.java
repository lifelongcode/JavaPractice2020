package com.ap.AugFive;

public class Hello {



    public static void main(String[] args) {
        //Let's first create an object of the Hello class
        Hello he = new Hello();

        System.out.println("Welcome " + he.myName() + " in the Club");
        goHome();

        subtractNumbers(500, 100);

        //Now we are going to call a return type method
        //First we need to create an object
        Hello numCal= new Hello();

        System.out.println(numCal.subtractNumberExm(25, 340));


        boolean isSummer =false;
        if(isSummer !=true) { //can be written the code like if(isSummer ==false)
            System.out.println("Let's go to fishing.");
        }else {
            System.out.println("No! it is still winter.");
        }

    }


    //We are going to create a regula Return type method
    public String myName(){
        return "Abraham";
    }

    public static void goHome() {
        System.out.println("Stay Safe.");
    }

        //static and void method
    public static void subtractNumbers(int firstNum, int secondNum){
       // int total= firstNum - secondNum;
        int total=0;
        System.out.println( total= firstNum - secondNum );
    }

    //Same logic but creating a method type return
    public int subtractNumberExm(int firstNum, int secondNum){
                int total =0;
        return total = firstNum - secondNum;

    }
}
