package com.green.java.ch04;


import java.util.Scanner;

class ScoreObj{

    char getGreade(int score) {
        if(score >= 90) {
            return  'A';
        } else if(score >= 80) {
            return  'B';
        } else if(score >= 70) {
            return  'C';
        }
        return 'D';
    }
}

public class FlowEx4Method {
    public static void main(String[] args) {
        int score = 0, score1 = 0;
        char grade = 'D' , grade1;

        System.out.print("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        ScoreObj so = new ScoreObj();
        grade = so.getGreade(score);
        grade1 = so.getGreade(score1);
        System.out.printf("%d점의 학점은 %c입니다.\n", score, grade);
    }
}

















