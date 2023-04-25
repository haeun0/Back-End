package com.green.java.cho7.poly;

public class PolyQuiz1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Bulldog bd1 = new Bulldog();
        Cat cat1 = new Cat();
        Duck duck1 = new Duck();

        animalCryingCall(dog1);
        animalCryingCall(bd1);
        animalCryingCall(cat1);
        animalCryingCall(duck1);

    }

     static void animalCryingCall(Animal ani) {

         ani.crying();
        if (ani instanceof Dog) { // ani(는 들어오는값)가 Dog안에 포함되는가?????true
            Dog dog1 = (Dog)ani; // 호출하고싶으면 형변환
            dog1.jump();
        }
     }
}
