package com.green.java.cho7.cards;

import com.green.java.ch06.Car;

public class Card {
    static final String[] KINDS = {"CLOVER", "HEART", "DIAMOND", "SPADE"}; //무늬들
    static final int NUM_MAX = 13; //무늬별 카드 수



    String kind; //무늬
    String num;

    //외부에서 무늬, 번호 값을 받아서 나의 멤버 필드 무늬와 번호에 대입하는 생성자를 만들어 주세요.

    public Card(String kind, String num) {
        this.kind = kind;
        this.num = num;





    }
    @Override
    public String toString() {
        return "kind: " + kind + ", num: " +num;
    }



}


