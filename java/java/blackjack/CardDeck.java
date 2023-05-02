package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

    public static final String[] PATTERNS = {"♠","♣","♥","♦"};
    public static final int CARD_CONT = 13;

    private List<Card> cardList;

    //선생님 코드
    public CardDeck() {
        this.cardList = new ArrayList<>();
        for(String patten : PATTERNS) {
            for (int i = 1; i <= CARD_CONT; i++) {
                this.cardList.add(new Card(patten, getDenominaion(i)));
            }
        }
    }
    private String getDenominaion(int num) {
        switch (num) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(num);
        }
    }

    /*
    //내 코드...
    public CardDeck(){
        this.cardList = new ArrayList<>();

        for (int i = 0; i < PATTERNS.length; i++) {
            for (int z = 0; z < CARD_CONT; z++) {
                if (z == 0) {
                    cardList.add(new Card(PATTERNS[i], "A"));
                }else if(z == 12) {
                    cardList.add(new Card(PATTERNS[i], "K"));
                } else if(z == 11) {
                    cardList.add(new Card(PATTERNS[i], "Q"));
                }else if(z == 10) {
                    cardList.add(new Card(PATTERNS[i], "J"));
                } else
                    cardList.add(new Card(PATTERNS[i], String.valueOf(z+1)));
            }
        }
    }*/

}
