package com.ap.loopnested;

public class NestedLoopExam {

    String[] placesToVisit = {"Paris", "New York", "Italy"};
    int[] costPerPerson = {3500, 4500, 3750};
    int totalAmount = 0;
    public int calculateCost(String customerChoice, int noOfCustomer ){
        try{
            for(int i=0; i<placesToVisit.length;i++){
                if(customerChoice == placesToVisit[i]){
                    totalAmount= costPerPerson[i] * noOfCustomer;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return totalAmount;
    }

  }


