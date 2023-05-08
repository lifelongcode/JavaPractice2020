package com.ap.lamda.beforelamda.usingConstructor;

public class BeforeLambdaExm {


    public  double doSomeOperation(double num1, double num2, String operationType ){
            switch (operationType){
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
        private double addOperation(double firstValue, double secondValue){
            double result = firstValue + secondValue;
            return result;
        }

        //method for calculation sub
        private double subOperation(double firstValue, double secondValue){
            double result = firstValue - secondValue;
            return result;
        }
        //method for calculation mul
        private  double mulOperation(double firstValue, double secondValue){
            double result = firstValue * secondValue;
            return result;
        }

        //method for calculation div
        private  double divOperation(double firstValue, double secondValue){
            double result = firstValue / secondValue;
            return result;
        }

    }

