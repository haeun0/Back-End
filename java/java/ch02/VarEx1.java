package com.green.java.ch02;

public class VarEx1 {
    //p.21
    public static void main(String[] args) {
        int year = 0; //값 0을 int타입의 변수명 year로 대입(초기화)
        int age = 14; //값 14를 int타입의 변수명 age로 대입(초기화)

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}
