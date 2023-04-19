package com.green.java.ch05;

    /*
    numArr 배열을 이용하여
    copyArr에 numArr보다 1칸 더 많게 만들어주세요.
    마지막 방에는 100을 넣어주세요
    coryArr에 numArr을 deep copy 해주세요.
    copyArr값을 모두 출력해 주세요
    copyArr[0] > 11
    copyArr[1] > 14
    ...
    copyArr[5] > 35
    copyArr[6] > 100
    */


import java.util.Arrays;

public class ArrayQuiz7 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35}; // 6개
        int[] copyArr = new int[numArr.length +1]; // 7개

        copyArr[ numArr.length ] = 100;
        //copyArr[ copyArr.length - 1 ] = 100; //무조건 마지막방 개수

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);
        }
        String result = Arrays.toString(copyArr);
        System.out.println(result); // for문을 돌리지 않아도 값을 바로 볼수 있다.
    }
}




/*

 마지막 방에
    deep copy를 한다.
    numArr의 값을 copyArr에 넣는다.
    
    프린트
 */


