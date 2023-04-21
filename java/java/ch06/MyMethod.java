package com.green.java.ch06;

public class MyMethod {

        //void > return type,  리턴타입
        //sum > method name, 메소드명
        //(int n1, int n2) > parameter, 파라미터, 매개변수
        void sum(int n1, int n2) { //매서드의 선언부
                if(n1 == 20) { // {에서 }까지 메서드의 구현부
                        return;
                }

                System.out.println(n1 + n2);
        } // viod는 return을 안넣으면 자동으로 넣어줌

        int sum2(int n1, int n2) { //값이 들어왔을 때
                return n1 + n2; //타입을 맞춰야한다!!, 값을 가지고 리턴한다??
        }//모든 메소드는 return;키워드를 만나야 돌아간다

}
