package com.green.java.ch04;

import java.util.Scanner;

//while문으로 해결
//랜덤값 1~100 사이의 랜덤값
//1~100사이의 정수를 입력: 50
//down
//1~100사이의 정수를 입력:
//up
//1~100사이의 정수를 입력:
//good!
//조건식 내가 입력한 값과 랜덤값이 다르다면

public class WhileQuiz1 {
    public static void main(String[] args) {
//        int input, answer;
//        answer = (int)(Math.random() * 100) + 1;
//        System.out.println(answer);
//        Scanner scan = new Scanner(System.in);
//        System.out.println("숫자입력 >");








/*

        input = scan.nextInt();
        while(input != answer) {
            if (input > answer) {
                System.out.println("down");
            } else if (input < answer) {
                System.out.println("up");
            }
            System.out.print("1~100사이의 정수를 입력: ");
            input = scan.nextInt();
        }
        System.out.println("good!");

*/



//        input = scan.nextInt();
//        while(input != answer) {
//            if (input < answer) {
//                System.out.print("up\n");
//            } else if (input > answer) {
//                System.out.print("down\n");
//            } else {
//                System.out.println("good!");
//            }
//        }



/*
        //쫌더 노력해보세요!
        boolean flag = true;
        int num;
        while (flag) {
            num = scan.nextInt();
            if(num < answer) {
                System.out.print("up\n");
            } else if(num > answer) {
                System.out.print("down\n");
            } else {
                System.out.println("good!");
                flag = false;
            }
        }*/




/*
        int input, answer;
        answer = (int)(Math.random() * 100) + 1;
        System.out.println(answer);
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("숫자입력 >");
            input = scan.nextInt();

            if (input > answer) {
                System.out.println("down");
            } else if (input < answer) {
                System.out.println("up");
            } else {
                System.out.println("good!");
            }
        } while (input != answer);
        */

        
        //선생님 코드
        //FlowEx28
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = (int)(Math.random() * 100) + 1;
        System.out.println(answer);


        do {
            System.out.println("1~100사이의 정수를 입력: ");
            input = scan.nextInt();

            if (input > answer) {
                System.out.println("down");
            } else if (input < answer) {
                System.out.println("up");
            }

        } while (input != answer);
        System.out.println("good!");


    }
}

