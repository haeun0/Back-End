package com.green.java.ch05;

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] score = new int[4][3];

        int[][] temp = {
                {0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},

        };

        System.out.printf("temp.length: %d\n", temp.length);
        System.out.printf("temp.length: %d\n", temp[0].length);
        System.out.printf("temp.length: %d\n", temp[1].length);
        System.out.printf("temp.length: %d\n", temp[2].length);

        int[] arr0 = temp[0];
        arr0[0] = 30; // 0번 칸에있는 0번에게 30으로 바꿔라 명령

        System.out.printf("temp[0][0] > %d\n", temp[0][0]);
        

        System.out.println(score[0][0]);
        score[2][1] = 10; // 접근 방법

        System.out.println(score.length); //행
        System.out.println(score[0].length); // 열
    }
}
