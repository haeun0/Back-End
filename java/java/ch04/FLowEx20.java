package com.green.java.ch04;

/*
    [1, 1] [1, 2] [1, 3]
    [2, 1] [2, 2] [2, 3]
    [3, 1] [3, 2] [3, 3]

 */
public class FLowEx20 {
    public static void main(String[] args) {
/*        for(int i=1; i<4 ; i++) {
            for(int z=1; z<4; z++) {
                System.out.printf("[%d, %d] ", i, z);
            }
            System.out.println();
        }*/

        int num = 4;
        for(int i=1; i<num ; i++) {
            for(int z=1; z<num; z++) {
                System.out.printf("[%d, %d] ", i, z);
            }
            System.out.println();
        }

    }
}
