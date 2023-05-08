package com.ap.inheritance.exm1;

public class Parent {
    protected int parentId;
    protected String parentName;

    public Parent(){
        this.parentId = 101;
        this.parentName="John";
    }
    public void display(){
        System.out.println(this.parentId + " " + this.parentName);
    }

}
