package com.green.java.ch04;

public class ForStudy2 {
    public static void main(String[] args) {
        //for문 이용

        // 159
        // 1, 2, 3, 4, 5

        //내 방법
//        for(int i = 1; i < 6 ; i++){
//
//            System.out.print( i + ( i < 5 ? "," : ""));
//
//        }

        //또다른방법
//        for(int i = 1; i < 6 ; i++){
//            System.out.print(i);
//            if(i < 5) {
//                System.out.print(",");
//            }
//        }


        System.out.println("\n--------------------");
        for(int i = 1; i < 3 ; i++){
            System.out.print(i);
            if(i > 1) {
                System.out.print(",");
            }
            System.out.print(i);
        }

        
    }
}
