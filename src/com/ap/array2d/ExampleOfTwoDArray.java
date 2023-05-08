package com.ap.array2d;

public class ExampleOfTwoDArray {
    public static void main(String[] args) {
        // 2D array = an array of arrays

        //This is the one way.
        /**
        String[][] cars = new String[3][3];

        cars[0][0]="Toyota";
        cars[0][1]="Honda";
        cars[0][2]="Nissan";

        cars[1][0]="Ford";
        cars[1][1]="GMC";
        cars[1][2]="Tesla";

        cars[2][0]="Audi";
        cars[2][1]="Mercedes-Benz";
        cars[2][2]="BMW";

        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
         */

        //Also, another way can be done.
        String[][] cars = {
                            {"Toyota", "Honda", "Nissan"},
                            {"Ford","GMC","Tesla"},
                            {"Audi","Mercedes-Benz","BMW"}
                          };


        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}

