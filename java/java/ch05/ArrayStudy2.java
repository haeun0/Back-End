package com.green.java.ch05;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[5]; //0부터 시작하기 때문에 마지막 방번호는 4이다.

        for(int i=0; i<numArr.length; i++) {
            System.out.println(numArr[i]);
        }
        boolean[] boolArr = new boolean[4]; // boolean으로 만들었으면 칸에 들어갈수있는것은 boolean타입만,기본이 false.
        for (int i = 0; i < boolArr.length; i++) {
            System.out.println(boolArr[i]);
        }

    }
}
