package com.ap.ikmtest;

public class CheckAnswer {
    public CheckAnswer() {
        this(10);
    }

    public CheckAnswer(int data) {
        this.data=data;
    }

    public void display(){
        class Decrementer{
            public void decrement(){
                data--;
            }
        }
        Decrementer d = new Decrementer();
        d.decrement();
        System.out.println("data = " + data);
    }

    private int data;

    public static void main(String[] args) {
        int data = 0;
        CheckAnswer ck = new CheckAnswer();
        ck.display();
        System.out.println("data = " + data);
    }
}
