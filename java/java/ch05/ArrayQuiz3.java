package com.green.java.ch05;

    /*
    numArr 배열을 이용하여
    각 방의 짝수값만 콘솔에 출력해 주세요.
    14
    2
    36

    */


public class ArrayQuiz3 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};

        //선생님 코드
//        System.out.println(numArr[0] % 2 == 0 ? "짝수" : "홀수");

        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i]%2 == 0) {
                System.out.println(numArr[i]);
            }
        }



/*        for(int i = 0; i < numArr.length; i++){

            if(numArr[i] % 2 == 0) {
                System.out.println(numArr[i]);

            }
        }*/

    }
}


/*
    나눠서
    나머지가 0이 되는것이 짝수

    짝수가 아닌경우 뒤로가기
    프린트
*/


