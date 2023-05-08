package com.ap.inheritance.exm1;

public class Child extends Parent{
    private int childId;
    private String childName;
    public Child(int childId, String childName){
        this.childId=childId;
        this.childName=childName;
    }

    public void display(){
        System.out.println(this.childId + " " + childName);
    }
}
