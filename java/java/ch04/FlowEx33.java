package com.green.java.ch04;


import java.util.Scanner;

public class FlowEx33 {
    public static void main(String[] args) {
        Loop1:
        for(int i = 2; i<=9;i++) {
            for(int z=1; z<=9; z++) {
                if(z ==5) {
                    break Loop1; //if(z ==5)만 빠져나온다....
                }
                System.out.printf("%d, %d\n", i, z);
            }
        }

    }
}




















