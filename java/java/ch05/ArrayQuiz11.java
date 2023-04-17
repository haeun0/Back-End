package com.green.java.ch05;

    /*
    numArr 배열을 이용하여
    배열에 들어있는 값 평균값 구해주세요.

    avg:
    */


public class ArrayQuiz11 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};


/*        double avg = 0, sum = 0, a = numArr.length;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        avg = sum / a;

        System.out.printf("avg: %.2f", avg);
        */


        int sum = 0;
        for(int i = 0; i < numArr.length; i++){
            sum += numArr[i];
        }
        double avg = (double)sum / numArr.length;

        System.out.printf("avg: %.2f", avg);

    }
}

/*
    다 더해서
    나누기 방개수


 */


