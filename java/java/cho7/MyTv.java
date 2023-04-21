package com.green.java.cho7;

public class MyTv extends Speaker {
    int channerl;

    void channerlUp() {
        channerl++;
    }

    void channerlDown() {
        channerl--;
    }

}

class MyTv2 {
    int channerl;

    void channerlUp() {
        channerl++;
    }

    void channerlDown() {
        channerl--;
    }
    Speaker speaker;

    void volumnUp() {
        speaker.volumn++;
    }

    void volumnDown() {
        speaker.volumn--;
    }

    int getVolumn() {return  speaker.volumn;}

}

class Speaker {
    int volumn;

    void volumnUp() {
        volumn++;
    }

    void volumnDown() {
        volumn--;
    }
}
