package com.ap.simplemethod;

public class A {

    public static void add(int firstNum, int secondNum) {
        int total;
        total = firstNum + secondNum;
        System.out.println(total);

    }

    public static void addItems(double firstItem, double secondItem, double thirdItem){
        double total;

        total = firstItem + secondItem + thirdItem;
        System.out.println("Your Total price $" + total ) ;
    }

    public static void addItemSale(int firstItem, int secondItem, int thirdItem){
        int total;

        total = firstItem + secondItem + thirdItem;
        System.out.println("Your Total price $" + total ) ;
    }

    //Example of one method can take another method assign value

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName+ " managed to get into position # "
                            + highScorePosition+ " on the high score table");
    }

    //This method will be assigned to another highScore
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >=1000){
            return 1;
        }else if(playerScore >=500 && playerScore <1000){
            return 2;
        }else if(playerScore >=100 && playerScore <500){
            return 3;
        } else{
            return 4;
        }
    }

    public static void main(String[] args){

        add(1234, 23345);

        addItems(.003, 4.45, 1);

        addItemSale(100,200,300);

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Abraham ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Parker ", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Jenifer ", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Mike ", highScorePosition);

    }


}
