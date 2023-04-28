package com.green.java.cho7.ArrayList;

public class MyArrayList {
    private int[] items;

    public MyArrayList() {
        items = new int[0];
        System.out.println(items.length);
    }

    public void add(int val) {
        int[] temp = new int[items.length +1];
        temp[items.length]  = val;
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    public void add(int num, int val){
        if(items.length < num){
            return;
        }
        int[] temp = new int[items.length +1];
        temp[num] = val;
        for (int i = 0; i < items.length; i++) {
            if(num > i) {
                temp[i] = items[i];
            } else if(num <= i){
                temp[i+1] = items[i];
            }
        }

        items = temp;
    }

    public String toString() {
        String str = "[";
        if(items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " +items[i];
            }
        }
        str+="]";
        return str;
    }

    public int size() {
        return items.length;
    }

    public int get(int idx) {
        return items[idx];
    }

    public void bubbleSourt(){
        for (int i = items.length-1; i >0; i--) {
            for (int z = 0; z < i ; z++) {
                int sideIdx = z+1;
                if(items[z] > items[sideIdx]){
                    int temp = items[z];
                    items[z] = items[sideIdx];
                    items[sideIdx] = temp;
                }
            }
        }
    }

}
