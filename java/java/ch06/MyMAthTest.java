package com.green.java.ch06;

public class MyMAthTest {
    public static void main(String[] args) {
        int n1 = 10, n2 = 22;

        //MyMathInstance 클래스에 있는 sum메소드
        //이용하여 n1, n2값을 더한 결과를 콘솔에 출력
        MyMAthInstance mmi = new MyMAthInstance();
        int r1 = mmi.sum(n1, n2);
        System.out.println(r1);

        //MyMAthStatic 클래스에 있는 sum메소드
        //이용하여 n1, n2값을 더한 결과를 콘솔에 출력
        int r2 = MyMAthStatic.sum(n1, n2);
        System.out.println(r2);

    }
}
