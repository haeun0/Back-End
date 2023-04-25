package com.green.java.cho7.poly;

public class Animal {
    private String name;

    public Animal() {

    }

    public Animal(String name){
        this.name = name;
    }
    public void crying() {
        System.out.println("동물이 운다.");
    }
}

class Dog extends Animal {
    public Dog() {


    }


    @Override //이름이 다르거나 실수할 경우 확인할수있음
    public void crying() {
        System.out.println("멍~멍~");
    }

    public void jump() {
        System.out.println("개가 점프!!");
    }
}

class Bulldog extends Dog {
    @Override
    public void crying() {
        System.out.println("으르렁!!");
    }
}

class Cat extends Animal {
    @Override
    public void crying() {
        System.out.println("야옹 야옹");
    }
}

class Duck extends Animal {
    @Override
    public void crying() {
        System.out.println("꽥 꽥");
    }
}

