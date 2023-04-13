package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {
        //리터럴 Literal, 값 그 자체!
        byte b1 = 127;
        System.out.println(b1);

        int i1 = 129;
        int i2 = (int)b1; //자동형변환, 문제 될 가능성이 없는경우
        b1 = (byte)i1; //강제형변환
        System.out.println(b1);
//   overflow 넘처버려서 값이 '-'가 된다.

        b1 = (byte)-129;
        System.out.println(b1);
//   underflow
    }
}
