package com.green.java.ch04;


import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = ' ';

        System.out.print("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        //100점 > A+
        //90점보다 크거나 같으면 "%d점의 학점은 A입니다."
        //80점보다 크거나 같으면 "%d점의 학점은 B입니다."
        //70점보다 크거나 같으면 "%d점의 학점은 C입니다."
        //70점 미만 opt없음 무조건 D학점 "%d점의 학점은 D입니다."

        //1의 3자리가 8점이상 +, 4미만 -, 나머지 0


        //+,- 점수 잘못 기입 다시 수정할것
//        if(score >= 90){
//            grade = 'A';
//            if(score == 90){
//                opt = ' ';
//            }
//            else if(Math.round(score)>=100){
//                opt = '+';
//            } else {
//                opt = '-';
//            }
//        } else if(score >= 80){
//            grade = 'B';
//            if(score == 80){
//                opt = ' ';
//            }
//            else if(Math.round(score)>=90){
//                opt = '+';
//            } else {
//                opt = '-';
//            }
//        } else if(score >= 70){
//            grade = 'C';
//            if(score == 70){
//                opt = ' ';
//            }
//            else if(Math.round(score)>=80){
//                opt = '+';
//            } else {
//                opt = '-';
//            }
//        } else{
//            grade = 'D';
//        }
//        System.out.printf("%d점의 학점은 %c%c입니다.", score, grade, opt);


        
        //도움받아서 더 줄여보기
//        if(score >= 90){
//            grade = 'A';
//        } else if(score >= 80){
//            grade = 'B';
//        } else if(score >= 70){
//            grade = 'C';
//        } else{
//            grade = 'D';
//        }
//
//        if(score %10 >= 8 ){
//            opt = '+';
//        }
//        else if(score %10 >= 4){
//            opt = '-';
//        } else {
//            opt = ' ';
//        }
//
//        System.out.printf("%d점의 학점은 %c%c입니다.", score, grade, opt);


        //선생님 코드
        if(score > 100 || score < 0) {
            System.out.println("점수는 0~100점 사이입니다.");
        } else {
            //0~100
            if(score >= 90) { //90~100
                grade = 'A';
            } else if(score >= 80) { // 0~ 89 > 90~89
                grade = 'B';
            } else if(score >= 70) { //0~ 79 > 70~79
                grade = 'C';
            }
        }

        // 0 ~ 69
        // 78 > 8, 99 > 9, 71 > 1


        if(grade != 'D' ){
            int num = score % 10;
            if(num >= 8 || score == 100){
                opt = '+';
            }
            else if(num < 4){
                opt = '-';
            } else { // 4, 5, 6, 7
                opt = '0';
            }
        }

        System.out.printf("%d점의 학점은 %c%c입니다.\n", score, grade, opt);



    }
}
















