package com.green.java.ch05;

    /*
    numArr 배열을 이용하여
    값 리터럴 적지 않는다.
    0번, 1번방 값 스와이핑
    */


import java.util.Arrays;

public class ArrayQuiz9 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};

        int temp = numArr[0];
        numArr[0] = numArr[1];
        numArr[1] = temp;
        
        System.out.println(Arrays.toString(numArr));

    }
}

/*
    0번방값을 다른데 저장해두고
    0번방값에 1번방값을 넣는다.
    1번방값에 다른데 저장해뒀던 값을 넣어준다.
    프린트
 */


