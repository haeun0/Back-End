package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.print("숫자를 입력: ");
        int num = scan. nextInt();
        System.out.println("num : " + num);
//        String a = "짝수", b = "홀수", c;
//
//        c = num % 2 == 0 ? a : b;
//
//        System.out.println(c);

        //선생님 코드
        String result = num % 2 == 0 ? "짝수" : "홀수";
        System.out.printf("숫자 %d는 %s 이다.", num, result);


        //num값이 홀수면 "홀수" 출력.
        //num값이 짝수면 "짝수" 출력.

    }
}
