package com.green.java.ch04;

/*
 (1) squre
 (2) square root
 (3) log
 원하는 메뉴(1~3)를 선택하세요.(종료: 0) > 4
 메뉴를 잘못 선택하셨습니다.(종료 : 0)
 (1) squre
 (2) square root
 (3) log
 원하는 메뉴(1~3)를 선택하세요.(종료: 0) > 1
 메뉴를 잘못 선택하셨습니다.(종료 : 0)
 (1) squre
 (2) square root
 (3) log
 원하는 메뉴(1~3)를 선택하세요.(종료: 0) > 0
 메뉴를 잘못 선택하셨습니다.(종료 : 0)
 프로그램을 종료합니다.

*/

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
/*        do {
            System.out.println("(1) squre");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요(종료: 0) >");

            input = scan.nextInt();

            if (input > 3 || input < 0) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료 : 0) >");
            } else if (input > 0 || input < 4) {
                System.out.printf("선택하신 메뉴는 %d번 입니다. (종료 : 0) >\n", input);
            }
        }while (input != 0);

                System.out.println("프로그램을 종료합니다.");*/



        while (true) {
            System.out.println("(1) squre");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요(종료: 0) >");

            input = scan.nextInt();

            if (input < 0 || input > 3) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료 : 0) >");
            } else if (input == 0) {
                break;
            } else {
                System.out.printf("선택하신 메뉴는 %d번 입니다. (종료 : 0) >\n", input);
            }

        }
        System.out.println("프로그램을 종료합니다.");



    }
}




















