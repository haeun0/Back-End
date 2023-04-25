package com.green.java.cho7.cards;

import com.green.java.ch06.Car;

public class CardDeck {
    Card[] cards;
    int idx;

    CardDeck() {
        cards = new Card[52];

/*        for(int i = 0; i< cards.length; i++){
            cards[i] = new Card("","");
        }*/


        int idx = 0;
        for (int i = 0; i < Card.KINDS.length; i++) {
            for (int z = 1; z <= Card.NUM_MAX; z++) {
                String num = null;
             switch(z) {
                 case 1:
                     num= "A";
                     break;
                 case 11:
                     num= "J";
                     break;
                 case 12:
                     num= "Q";
                     break;
                 case 13:
                     num= "K";
                     break;
                 default:
                     num = String.valueOf(z); //num = z + ""; //정수열 2를 문자 "2"로 바꿔준다.
             }
                cards[idx++] = new Card(Card.KINDS[i],num);
            }
        }
    }
    void openCards() {
        for(Card c : cards) {
            System.out.println(c);
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int rIdx = (int)(Math.random() * cards.length);
            if(i == rIdx) {continue;} //수가 적을경우 넣으면 좋지만, 수가 클경우 좋지않음
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }
    }


    Card pick() {
        if(idx == cards.length) {return null;}
        Card c = cards[idx];
        cards[idx++] = null;
        return c;
    }


}
