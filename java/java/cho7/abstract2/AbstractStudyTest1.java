package com.green.java.cho7.abstract2;

public class AbstractStudyTest1 {
    public static void main(String[] args) {
        // AbstractStudy1 acs1 = new AbstractStudy1(); //추상클래스는 객체화할 수없다.

        AbstractStudy1 acs1 = new ChildCalss();
        acs1.sum(10,20);

        AbstractStudy1 acs2 = new Child2Calss();
        acs2.sum(10,20);
    }
}
