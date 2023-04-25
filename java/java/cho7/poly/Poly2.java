package com.green.java.cho7.poly;

public class Poly2 {

    public static void main(String[] args) {
        Animal ani1 = new Bulldog();
        boolean r1 = ani1 instanceof Bulldog; // 담을 수 있을때만 형변환 가능
        System.out.println("r1 : " + r1);
        Bulldog bd1 = (Bulldog) ani1;

        System.out.println("r2 : " + (ani1 instanceof Cat));
        //Cat c1 = (Cat)ani1;
        
    }
}
