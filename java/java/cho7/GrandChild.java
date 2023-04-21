package com.green.java.cho7;

public class GrandChild extends Child {
    public GrandChild() {
        super(); // 직속부모 생성자를 불러오라 직속부모는 Child
                 // 부모에 있는 기본 생성자를 불러온다.
                 // 근데 이게 원래 기본적으로 생략 되어있음.
        System.out.println("-- GrandChild 기본 생성자 --");
    }
}
