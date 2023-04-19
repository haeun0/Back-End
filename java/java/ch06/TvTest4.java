package com.green.java.ch06;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3]; //tv객체의 주소값만 들어갈수있다.(Tv tv1, tv2, tv3;)
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = 10 + i;
            /*
                Tv tv = new Tv();
                tvArr[i] = tv;
                tv.channel = 10 + i;
                위에 두줄과 같은뜻
            */

        }
        System.out.println(tvArr[2].channel);
    }
}
