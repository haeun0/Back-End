package com.green.java.cho7;

public class MyTvTest {
    public static void main(String[] args) {
        MyTv mt = new MyTv();
        mt.volumnUp();
        mt.volumnUp();
        mt.volumnUp();

        System.out.println(mt.volumn);

        MyTv2 mt2 = new MyTv2();
        mt2.speaker = new Speaker();
        mt2.volumnUp();
        mt2.volumnUp();

        System.out.println(mt2.getVolumn());
    }
}
