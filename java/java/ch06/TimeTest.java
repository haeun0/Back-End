package com.green.java.ch06;

import java.util.Scanner;

public class TimeTest {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                Time t1 = new Time();
                //hour 1~23 저장

                System.out.println("hour: " + t1.getHour());
                t1.setHour(5);
                System.out.println("hour: " + t1.getHour());
                t1.setHour(-5);
                System.out.println("hour: " + t1.getHour());
                t1.setHour(25);
                System.out.println("hour: " + t1.getHour());
                t1.setHour(1);
                System.out.println("hour: " + t1.getHour());
                t1.setHour(23);
                System.out.println("hour: " + t1.getHour());
/*                System.out.print("시간을 입력하시오. ");
                int hour = scan.nextInt();
                t1.setHour(hour);
                System.out.println("hour: " + t1.getHour());*/
        }
}
