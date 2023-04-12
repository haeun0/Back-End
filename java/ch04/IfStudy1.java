package com.green.java.ch04;

public class IfStudy1 {
    public static void main(String[] args) {
        //p.136
        int num = 9;
        if(num == 10){
            System.out.println("num은 10입니다.");
        } else {
            System.out.println("num은 10이 아니다.");
        }

        int num2 = 4;
        if(num2 >= 20) {
            System.out.println("num2은 20이상");
        } else if(num >= 10) {
            System.out.println("num2은 10이상");
        } else if(num >= 5) {
            System.out.println("num2은 5이상");
        } else {
            System.out.println("num2은 5미만");
        }

        System.out.println("끝!");
    }
}
