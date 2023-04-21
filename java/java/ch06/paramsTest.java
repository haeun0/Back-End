package com.green.java.ch06;

public class paramsTest {
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println(num); // 10

        NumberBox nb = new NumberBox();
        nb.num = 10;
        changeNum2(nb);
        System.out.println(nb.num); //20

    }
    static void changeNum(int num) {
        num = 20;
    }

    static void changeNum2(NumberBox nb2) {
        nb2.num = 20;
    }

}

class NumberBox {
    int num;
}
