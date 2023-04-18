package com.green.java.ch05;

    /*
    numArr 배열을 섞어주세요
    */


import java.util.Arrays;

public class ArrayQuiz12 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};


        for (int i = 0; i < numArr.length; i++) {

            if(i == i) {
                int a = (int)(Math.random() * numArr.length);
                int temp = numArr[i];
                numArr[i] = numArr[a];
                numArr[a] = temp;
            }

        }  System.out.println(Arrays.toString(numArr));

        System.out.println("----------------------");

        for (int i = 0; i < numArr.length; i++) {
            int rIdx = (int)(Math.random() * numArr.length);
            if(i == rIdx) {continue;}
            int temp = numArr[i];
            numArr[i] = numArr[rIdx];
            numArr[rIdx] = temp;


        }  System.out.println(Arrays.toString(numArr));



    }
}

/*


    예를들어
    i 가 0 일때 0~5의 랜덤한 값을 뽑는다. ridx 3 이 나온경우 3번째 방 7을 0번방 11이랑 바꾼다.
    i 가 1 일때            "        .  ridx ? 이 나온경우....
 */


