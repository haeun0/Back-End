package com.green.java.ch04;

public class SwitchStudy1 {
    public static void main(String[] args) {
        int level = 5;
        switch(level) {
            default:
                System.out.println("lever은 1~5가 아님");
            break;
            case 5:
                System.out.println("lever은 5");
            case 4:
                System.out.println("lever은 4");
            case 3:
                System.out.println("lever은 3");
                break;
            case 2:
                System.out.println("lever은 2");
                break;
            case 1:
                System.out.println("lever은 1");
                break;

        }
    }
}
