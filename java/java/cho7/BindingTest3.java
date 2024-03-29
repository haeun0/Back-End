package com.green.java.cho7;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        // p.method(5); //Parent3는 몰루..

        p.method();
        c.method(5);
    }
}

class Parent3 {
    protected int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3 {
    private int x = 200;

    void method(int x) {
        System.out.println("x =  " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}
