package com.green.java.ch05;

    /*
    번호  국어  영어  수학  총점  평균 \t
    ========================
    1   100    90    80  270  90.0
    2    20    20    60   60   20.0
    ...
    총점
    국어: 240
    영어: 230
    수학: 220

    */


import java.security.spec.RSAOtherPrimeInfo;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                  {100, 90, 80}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };

/*        int[] sum = {0, 0, 0};
        double avg = 0.0;
        System.out.println("번호\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t");
        System.out.println("=========================");
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {

                sum[j] += score[i][j];
                avg = sum[j] / score[j].length ;

            }
            int j =0;
            System.out.printf("%d\t" + "%d\t" + "%d\t" + "%d\t" + "%d\t" +  "%.1f\n", i + 1, score[i][j], score[i][j + 1], score[i][j + 2], sum[j], avg);
        }
        System.out.println("=========================");
        Loop1:
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length-1; j++) {

                System.out.printf("총점\n"+ "국어: %d\n"+ "영어: %d\n"+ "수학: %d\n", sum[j], sum[j+1], sum[j+2]);
                break Loop1;
            }
        }*/

        String[] titles = {"국어", "영어", "수학"};
        int[] sumArr = new int[titles.length];
        System.out.print("번호\t");
        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%s\t", titles[i]);
        }

        System.out.println("총점\t평균





    }
}


/*


 */


