package com.green.java.cho7.abstract2;

public abstract class AbstractStudy1 { //추상클래스는 강제성이 있음 //객체화를 하지않고 부모로서만 쓰고 싶을때 예를 들어 중력...

    abstract void sum(int n1, int n2); // 추상메서드 // 추상적인것들은 객체화 금지 하기위해 막아주기

    int multi(int n1, int n2) { // 일반 메서드를 가질수 도 있음
        return n1 * n2;
    }

}


class ChildCalss extends AbstractStudy1 { // 무조건 부모의 추상클래스를 강제로 오버라이딩 하게함 //기능을 몰아줌..?

    @Override
    void sum(int n1, int n2) {
        System.out.println("합계 : "+ (n1 + n2));
    }
}

class Child2Calss extends AbstractStudy1 { //implyment method
    @Override
    void sum(int n1, int n2) {
        System.out.println("sum : "+ (n1 + n2));
    }

}

