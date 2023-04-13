package com.green.java.ch04;

import java.util.Scanner;

public class SwitchStudy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("점수 입력 : ");
        int score = scan.nextInt();

        //switch문 사용
        //0~100점만 score에 들어온다는 전제로 작업.
        //예외처리 X
        //90~100 "%d 점의 학점은 A입니다."
        //80~89 "%d 점의 학점은 B입니다."
        //70~79 "%d 점의 학점은 C입니다."
        //나머지 "%d 점의 학점은 D입니다."

        char grade = ' ';
        switch(score) {
            case 100: case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            case 70:
                grade = 'C';
                break;
            default:
                grade = 'D';

        }

        System.out.printf("%d 점의 학점은 %c입니다.", score, grade);

        //선생님 코드
//        String grade = "D";
//        switch (score / 10) {
//            case 10: case 9:
//                grade = "A";
//                break;
//            case 8:
//                grade = "B";
//                break;
//            case 7:
//                grade = "C";
//                break;
//        }
//
//        System.out.printf("%d 점의 학점은 %s 입니다.", score, grade);
    }
}
