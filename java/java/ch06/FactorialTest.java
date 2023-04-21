package com.green.java.ch06;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4); // 4*3*2*1
        System.out.printf("result : %d\n", result);

        // 폴더를 탐색할때
        // 폴더 안에 폴더안에 폴더안의 폴더 안의 파일명 출력 등등...은 재귀함수로 구현할경우 깔끔하다
    }
    static int factorial(int n) {
        System.out.print(n);
        int result = 0;
        if(n==1){
            return 1;

        }
        return  n *factorial(n-1);
    }
}
