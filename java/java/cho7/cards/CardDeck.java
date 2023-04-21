package com.green.java.cho7.cards;

public class CardDeck {
    Card[] cards;

    CardDeck() {
        cards = new Card[52];

        for(int i = 0; i< cards.length; i++){
            cards[i] = new Card("","");
        }

    }



}
