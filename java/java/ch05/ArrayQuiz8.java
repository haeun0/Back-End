package com.green.java.ch05;

    /*
    numArr 배열을 이용하여
    Arrays.toString 메소드 이용하지 않고
    아래처럼 출력되도록 로직으로 해결하세요.
    [11, 14, 2, 7, 36, 35]
    */


import java.util.Arrays;

public class ArrayQuiz8 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};

        System.out.printf("[");

        for (int i = 0; i < numArr.length; i++) {

            if(i < numArr.length -1) {
                System.out.printf("%d, ", numArr[i]);
            } else {
                System.out.printf("%d", numArr[i]);
            }

        }
        System.out.printf("]");






  /*      int[] copyArr = new int[numArr.length + 2];
        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }
        for (int i = 0; i < copyArr.length; i++) {
            if (i == 0){
                System.out.printf("[");
            }
            else if(i < copyArr.length -2) {
                System.out.printf("%d, ", copyArr[i]);
            } else if(i < copyArr.length -1){
                System.out.printf("%d", copyArr[i]);
            } else {
                System.out.println("]");
            }

        System.out.printf("[%d", numArr[0]);
        for (int i = 1; i < numArr.length; i++) {
            System.out.printf(", %d", numArr[i]);
        }
        System.out.println("]");
*/


    }
}




/*
  앞에 [
  숫자, 숫자,... 마지막 숫자는,없이
  뒤에 ]
 */


