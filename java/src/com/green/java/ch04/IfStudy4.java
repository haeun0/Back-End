package com.green.java.ch04;


import java.util.Scanner;

public class IfStudy4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D';

        System.out.print("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        //90점보다 크거나 같으면 "%d점의 학점은 A입니다."
        //80점보다 크거나 같으면 "%d점의 학점은 B입니다."
        //70점보다 크거나 같으면 "%d점의 학점은 C입니다."
        //나머지 "%d점의 학점은 D입니다."


//        if(score >= 90) {
//            System.out.printf("%d점의 학점은 A입니다.", score);
//        } else if(score >= 80 ) {
//            System.out.printf("%d점의 학점은 B입니다.", score);
//        } else if(score >= 70 ) {
//            System.out.printf("%d점의 학점은 C입니다.", score);
//        } else {
//            System.out.printf("%d점의 학점은 D입니다.", score);
//        }


        //선생님 코드
        if(score >= 90) {
            grade = 'A';
        } else if(score >= 80) {
            grade = 'B';
        } else if(score >= 70) {
            grade = 'C';
        }

        System.out.printf("%d점의 학점은 %c입니다.\n", score, grade);





    }
}
















