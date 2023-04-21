package com.green.java.cho7;

class Tv{
    boolean power;
    int channerl;

    void power() { power = !power; }
    void channerlUp() { channerl++;}
    void ChannerlDown() { channerl--;}
}
class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String txt) {
        if(caption) {
            System.out.println(txt);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channerl = 10;
        ctv.channerlUp();
        System.out.println(ctv.channerl);
        ctv.displayCaption("자막 나오니?");// boolen은 기본이 false라 자막이 안나옴
        ctv.caption = true;
        ctv.displayCaption("이제 자막 나오니?");
    }
}
