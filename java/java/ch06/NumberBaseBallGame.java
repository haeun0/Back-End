package com.green.java.ch06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGame {
    public static void main(String[] args) {
        final int NUMBER_COUNT = 3;
        int[] numArr = getRandomNumderArr(NUMBER_COUNT);
        System.out.println(Arrays.toString(numArr));

        Scanner scan = new Scanner(System.in);
        System.out.println("[Game Start!]");


        int count=0;
        int[] myArr = new int[NUMBER_COUNT];
        while(true) {
            count++;

            for (int i = 0; i < NUMBER_COUNT; i++) {
                System.out.printf("%d번 숫자 입력", i+1);
                myArr[i] = scan.nextInt();
            }

            int s = 0, b = 0, o = 0;
            for (int i = 0; i < NUMBER_COUNT; i++) {
                for (int z = 0; z < NUMBER_COUNT; z++) {
                    if (numArr[i] == myArr[z]) {
                        if (i == z) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            o = NUMBER_COUNT - (s + b);
            System.out.printf("S: %d, B: %d, O: %d\n", s, b, o);

            if(s == NUMBER_COUNT) {
                System.out.printf("[YOU WIN!] count: %d", count);
                break;
            }

        }
    }
    //S:, B:1, O:1

    static int[] getRandomNumderArr(int numberCount) {
        int[] arr = new int[numberCount];

        int selectedIdx = 0;
        Loop:
        while(selectedIdx < arr.length) {// 안에 랜덤값 넣기
            int rVal = getRandomNumderArr2(1, 9);

            for (int i = 0; i < selectedIdx; i++) {// 중복체크
                if(arr[i] == rVal) {
                    continue Loop;
                }
            }
            arr[selectedIdx++] = rVal;
        }
        return arr;
    }

    static int getRandomNumderArr2(int min, int max ){
      return   (int)(Math.random() * (max - min) +1)+min;
    }
}
