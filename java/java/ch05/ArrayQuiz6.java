package com.green.java.ch05;

    /*
    numArr 배열을 이용하여
    copyArr에 numArr을 deep copy 해주세요.
    copyArr값을 모두 출력해 주세요.
    copyArr[0] > 11
    copyArr[1] > 14
    ...
    copyArr[5] > 35
    */


public class ArrayQuiz6 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length]; // 배열을 복사 한다.


        for (int i = 0; i < numArr.length; i++) { // copyArr에 numArr의 값을 넣는다. 여기까지가 deep copy!
            copyArr[i] = numArr[i];
        }

        numArr[0] = 33;

        for (int i = 0; i < numArr.length; i++) { // 프린트
            System.out.printf("numArr[%d] > %d\n", i, numArr[i]);
        }

        System.out.printf("----------------------------\n");
        for (int i = 0; i < copyArr.length; i++) { // 프린트
            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);
        }

    }
}

//deep copy 검증하는 방법
//복사하고
// numArr[0] = 33;
//copyArr의 모든 값을 출력해본다.


/*
    deep copy를 한다.
    numArr의 값을 copyArr에 넣는다.
    
    프린트
 */


