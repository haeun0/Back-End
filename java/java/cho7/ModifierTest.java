package com.green.java.cho7;

public class ModifierTest {

    private int num1; // 같은 클래스에서만 접근가능 외부에서는 접근 불가능
    int num2; // 같은 패키지에서 접근 가능
    protected int num3; //private + defalult와 같은데 상속관계도 접근가능
    public int num4; //완전 오픈

    public void printNum1() { //메소드는 자유....
        System.out.println(num1);
    }

}
