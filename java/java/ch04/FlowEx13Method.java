package com.green.java.ch04;


public class FlowEx13Method {
    //p.159
    public static void main(String[] args) {
        // 최소값~최대값 사이의 값을 더하고 출력
        //sum: 값
        printAllSum(1,100);
        //1 ~ 100 sum = 5050


        printAllSum(2, 3);
        //2~3 sum = 5

    }

    public static void printAllSum(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        } System.out.printf("%d ~ %d sum = %d\n", min, max, sum);
    }
}
