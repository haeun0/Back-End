package com.green.java.cho7.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);


        System.out.println(myList.toString());


        myList.add(4, 100);
        System.out.println(myList.toString());
        System.out.println(myList.size());

        int v1 = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            int val = myList.get(i);
            System.out.println(val);
        }

        System.out.println("----------------------");

        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            int val = myList.get(i);
            sum += val;
        }System.out.println("sum : " +sum);


    }
}
