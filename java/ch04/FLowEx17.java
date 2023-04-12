package com.green.java.ch04;

public class FLowEx17 {
    //p.162
    public static void main(String[] args) {
        int star = 5;
        //*
        //**
        //***
        //****
        //*****

//        for(int i = 0; i<star; i++) {
//            for(int j = 0; j<= i; j++){
//                System.out.printf("*");
//            }
//            System.out.println();
//        }

        for(int i = 1; i<star; i++) {
            for(int j = 0; j< i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }



    }
}
