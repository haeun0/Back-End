package com.green.java.ch05;

public class ArrayStudy5 {
    public static void main(String[] args) {

        int[] numArr = new int[] { 10, 20, 30, 40, 50};
        int[] copyArr = new int[numArr.length];//Deep Copy, 깊은 복사, 새로운 배열을 만들었다.


        for(int i =0; i<numArr.length;i++){
            copyArr[i] = numArr[i];
        }

        numArr[0] = 123; // deep copy가 되었는지 검증용으로 추가

        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("numArr[%d] : %d\n", i, numArr[i]);
        }

        System.out.println("-------------------------");

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);
        }

    }
}
