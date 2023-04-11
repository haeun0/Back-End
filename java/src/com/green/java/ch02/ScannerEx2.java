package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "장하은";
        int age = 0;
        System.out.print("나이 입력 : ");

        //나의 이름은 장하은이고 나이는 00살입니다.

        String strAge = scan.nextLine();
        age = Integer.parseInt(strAge);

        System.out.printf("나의 이름은 %s이고 나이는 %d살입니다.", name, age - 1);
    }
}
