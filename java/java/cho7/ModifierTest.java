package com.green.java.cho7;

public class ModifierTest {

    private int num1; // 외부에서 접근 불가능
    int num2; // 같은 패키지에서 접근 가능
    protected int num3; //
    public int num4; //완전 오픈

    public void printNum1() { //메소드는 자유....
        System.out.println(num1);
    }

}
