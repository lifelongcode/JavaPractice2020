package com.ap.whatitwouldbe;

public class ExampleFindAnswer {

    static class A{
        A(){
            f();
        }
        public void f(){
            System.out.println("A ctor");
        }

    }

    static class B extends A{
        B(){
            f();
        }

        public void f(){
            System.out.println("B ctor");
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.f();

        A a = new A();
        a.f();
    }

    //Output will be
    /**
     B ctor
     B ctor
     B ctor
     A ctor
     A ctor
     */
}
