package com.green.java.ch04;


public class FlowEx13 {
    //p.159
    public static void main(String[] args) {
        // 1~10 사이의 값을 더하기
        int sum = 100;
        for(int i =1; i<101; i++) {
            System.out.printf("sum: %d, i: %d\n", sum, i);
            //sum = sum + i;
            sum += i;
        }

        System.out.println("sum : " + sum);

    }
}
