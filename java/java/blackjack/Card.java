package com.green.java.blackjack;

public class Card {
    private String pattern; //무늬
    private String denominaion; //점수

    public Card(String pattern, String denominaion) {
        this.pattern = pattern;
        this.denominaion = denominaion;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenominaion() {
        return denominaion;
    }
}
