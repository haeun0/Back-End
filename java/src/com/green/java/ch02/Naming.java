package com.green.java.ch02;

public class Naming {

    //p.25
    public static void main(String[] args) {
        //단어 + 단어 + 단어

        //Hello World Bye
        //기법
        //파스칼 케이스 기법 > 클래스명
        String HelloWorldbye;

        //카멜 케이스 기법 > 변수명, 메소드명
        String helloWorldBye;

        //스네이크 케이스 기법
        //String hello-world-bye;

        //이름에 쓸 수 있는 특수기호 2개 : _ , $
        String _hi, h$i;

        //이름 처음에 숫자 사용할 수 없다. but 처음만 아니면 된다.
        //String 1oo
        String a1a;

        //이름에 빈칸 사용할 수 없다.
        //String hello Wrold;

        //대소문자 구분
        String aaa;
        String aAa;
        String aaA;

        //예약어 사용금지(파란색상 단어는 예약어)
        //String public;
        String pUblic;
        
        
        //상수는 전부 대문자, 스네이크 케이스 기법
        final int MY_NUM = 13;
        //MY_NUM = 20; 상수는 한번 입력한경우 변경할 수 없다.
        //변수보다 기능이 없기때문에 속도가 빨라서 사용한다.



    }
}
