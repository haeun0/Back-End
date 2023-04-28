package com.green.java.cho7.ArrayList;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //generic 제네릭 int형만 받고 int형으로 뱉어낸다, 형변환 없어도됨
        //list.add("11");
        //list.add(10.1);
        //list.add(true);
        list.add(10);
        list.add(13);

        int n1 = list.get(0);
        System.out.println(list);
    }
}
