package com.green.java.cho7.ArrayList;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1, 100); //값을 변경하고싶으면 넣고싶은 곳, 값
        list.add(0, 300);
        System.out.println(list);

        int removeValue = list.remove(4); //4번방을 지우고 지운 값을 removeValue에 저장
        System.out.println("removeValue : " + removeValue);
        System.out.println(list);
        System.out.println(list.size());

    }
}
