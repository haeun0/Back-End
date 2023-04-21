package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {
        String str = new String("dd"); // String 객체의 주소값만 담을수 있는 레퍼런스 변수
        Tv tv = new Tv(); // Tv 객체의 주소값만 담을수 있는 레퍼런스 변수
        System.out.printf("power : %b\n", tv.power); //담겨있는 주소값에 접근 방법  // 주소값.
        System.out.printf("channel : %d\n", tv.channel);

        tv.power = true; //접근해서 바꾸기
        System.out.printf("power : %b\n", tv.power);
        tv.power(); //호출, 일을 시켰다. // 중괄호에 들어있는 것이 실행됨
        System.out.printf("power : %b\n", tv.power);

        tv.channelUp();// Tv객체에 있는 channelUp메서드를 호출
        tv.channelUp();
        System.out.printf("channel : %d\n", tv.channel);
        tv.channel = 10;
        System.out.printf("channel : %d\n", tv.channel);

        Tv tv2 = tv; //Tv클래스의 tv2에 tv의 주소값을 복사해 준다.
        System.out.printf("channel : %d\n", tv2.channel);
    }
}
