package com.green.java.cho7.abstract2;

public class FighterTest {
    public static void main(String[] args) {
        Fightable f1 = new Fighter();
        Fightable f2 = new Fighter2();

        //f1.jump();

        f1.sum(10,20);
        f1.sum(19,20);

        f2.sum(30,40);
        f2.sum(29,40);
    }
}
