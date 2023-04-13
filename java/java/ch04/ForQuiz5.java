package com.green.java.ch04;

import java.util.Scanner;

public class ForQuiz5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("출력하고 싶은 구구단은? ");
        int gugudan = scan.nextInt();

        for(int i = gugudan, z = 1; z<10 ; z++) {
            System.out.printf("%d x %d = %d\n", i, z, i*z);
        }

    }
}
