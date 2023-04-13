package com.green.java.ch03;

public class OperatorEx18 {
    public static void main(String[] args) {
        //p.107
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1_000) / 1_000.0;
        System.out.println(shortPi);

        System.out.println(Math.round(315.4)); //315
        System.out.println(Math.round(315.5)); //316 반올림
        System.out.println(Math.ceil(315.01)); //316.0
        System.out.println(Math.floor(315.999999)); //315.0 내림
        //round 위에 마우스를 올려보면 long type
        //ceil 위에 마우스를 올려보면 double type
        //floor 위에 마우스를 올려보면 double type
    }
}
