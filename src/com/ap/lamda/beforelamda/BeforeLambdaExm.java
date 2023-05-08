package com.ap.lamda.beforelamda;

public class BeforeLambdaExm {

    public static void main(String[] args) {
        System.out.println("Result is " + doSomeOperation(10,9, "multiply"));
    }


    public static double doSomeOperation(double num1, double num2, String opType){
        switch (opType){
            case "add":
                return addOperation(num1, num2);
            case "subtract":
                return subOperation(num1, num2);
            case "multiply":
                return mulOperation(num1, num2);
            default:
                //default let's considering there are no wrong inputs,
                // the default case is our purpose
                // divOperation == "divide"
                return divOperation(num1, num2);
        }
    }

    //Now let's create all operation add, subtract, mul, div

    //method for calculation add
    public static double addOperation(double firstValue, double secondValue){
        double result = firstValue + secondValue;
        return result;
    }

    //method for calculation sub
    public static double subOperation(double firstValue, double secondValue){
        double result = firstValue - secondValue;
        return result;
    }
    //method for calculation mul
    public static double mulOperation(double firstValue, double secondValue){
        double result = firstValue * secondValue;
        return result;
    }

    //method for calculation div
    public static double divOperation(double firstValue, double secondValue){
        double result = firstValue / secondValue;
        return result;
    }

}
