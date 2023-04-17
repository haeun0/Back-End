package com.green.java.ch05;

public class ArrayStudy4 {
    public static void main(String[] args) {

        int[] numArr = new int[] { 10, 20, 30, 40, 50};
        int[] copyArr = new int[numArr.length];//Deep Copy, 깊은 복사, 새로운 배열을 만들었다.

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);
        }

    }
}
