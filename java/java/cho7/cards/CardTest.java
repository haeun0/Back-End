package com.green.java.cho7.cards;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.openCards();

        System.out.println("-------------");
        cd.shuffle();
        cd.openCards();

        System.out.println("-------------");
/*
        Card c1 = cd.pick();
        System.out.println(c1.kind + "," + c1.num);

        Card c2 = cd.pick();
        System.out.println(c2.kind + "," + c2.num);
*/

        for (int i = 0; i < cd.cards.length; i++) {
            cd.pick();
        }
        cd.pick();

        System.out.println("-------------");
        cd.openCards();
    }

}
