package com.green.java.ch05;



public class ArrayQuiz1 {
    public static void main(String[] args) {
        int[] numArr = {0, 0, 0, 0};

        //for (값 입력, 1,2,3)

        //for (값 출력, 각 방에 있는 값을 출력)

        // 0 > 1
        // 1 > 2
        // 2 > 3

        for (int i = 0; i < numArr.length; i++) { //i 값은 여기에서만 추가 해줄것
            numArr[i] = i + 1;
        }

        /*
        numArr[0] = 1; // 0번방에 1을 넣어준다.
        numArr[1] = 2; // 1번방에 2를 넣어준다.
        numArr[2] = 3; // 2번방에 3을 넣어준다.
        */

        for (int i = 0; i < numArr.length; i++) { // 방안에 있는것을 출력만 해준다.!!
            System.out.println(i + " > " + numArr[i]);//
        }
    }
}
