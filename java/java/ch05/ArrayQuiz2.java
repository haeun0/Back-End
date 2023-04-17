package com.green.java.ch05;

    /*
    rNumArr은 10칸 가지고 있는 정수형 배열입니다.
    각 칸에 랜덤한 숫자 1~45사이의 값을
    모든 칸에 넣어주세요.
    */


public class ArrayQuiz2 {
    public static void main(String[] args) {
        int[] rNumArr = new int[6]; //빈방 6개 만들기

        for (int j = 0; j < rNumArr.length; j++) {
            rNumArr[j] = j + (int)(Math.random() * 45 + 1);
        }

        for (int i = 0; i < rNumArr.length; i++) {
            System.out.printf("[" + rNumArr[i] +"] ");
        }


    }
}


/*

 [] [] [] [] [] []
 6개 칸이 있고
  그 안에 차례대로 랜덤한 숫자가 들어갈수 있도록
  칸이 다 차면 끝
  프린트





*/


