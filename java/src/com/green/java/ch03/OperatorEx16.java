package com.green.java.ch03;

public class OperatorEx16 {
    public static void main(String[] args) {
        //p.105
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1_000) / 1_000f;
        System.out.println(pi);
        System.out.println(shortPi);
    }
}
