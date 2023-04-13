package com.green.java.ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        //p.116
        //&& and 연산자
        // || or 연산자
        //(2 > 1) && (3 > 2) : ture 전부다 t여야 t가 된다
        //(2 > 1) && (3 > 2) && (3 >= 5) : fales 하나라도 f면 f가 된다

        //(2 > 1) || (3 > 2) || (3 >= 5) : fales 전부다 f여야 f가 된다

        boolean r1 = (2 > 1) && (3 > 2);
        System.out.printf("r1 : %b\n", r1);

        boolean r2 = (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r2 : %b\n", r2);

        boolean r3 = (2 > 1) || (3 > 2) || (3 >= 5);
        System.out.printf("r3 : %b\n", r3);

    }
}
