package com.green.java.ch08;

public class TryCatchStudy5 {
    public static void main(String[] args) {
        try {
            getConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void getConnection() throws Exception { // throws Exception 던질수도있다 안던질수도있고
        System.out.println("DB 연결!!");
    }

    public static void otherGetConnecion() throws Exception {
        getConnection();
    }

    public static void otherGetConnecion2() {
        try {
            getConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
