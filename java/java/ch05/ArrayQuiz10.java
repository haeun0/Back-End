package com.green.java.ch05;

    /*
    numArr 배열을 이용하여
    가장 작은 숫자를 찾아내어 출력해 주세요.

    min:
    */


import java.util.Arrays;

public class ArrayQuiz10 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int min = numArr[0]; //numArr중 임의의 값을 불러와 min에 저장해준다.

        for (int i = 1; i < numArr.length; i++) {
            if(numArr[i] < min){ // 임의의 값 min보다 numArr[i]의 값이 작은지 확인한다.
                min = numArr[i]; // 임의의 값 min 보다 큰 경우 if문을 나가 i++ 후 비교, 작은경우 그 값을 min에 교체해 저장한다.
            }                    // 반복해서 0번방값부터 numArr.length번방값까지 비교하다보면
        }                        // min에는 제일 작은 숫자값이 들어가있는 상태가 된다.
        System.out.printf("min: %d", min);
    }
}

/*
    값비교....
    0번방이 1번방보타 큰가?

    %
    *

 */


