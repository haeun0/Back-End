package com.green.java.ch06;

public class Bike {
    String brand;
    String model;
    int price;


/*    public Bike(){ //기본 생성자 // Bike b1 = new Bike(); 로 자동생성 가능
        System.out.println("Bike 생성자");
    }*/

    Bike() {
        this("야마하", "H2-1", 10000); //내가 가지고 있는 생산자 호출
    }

    public Bike(String brand) { //생성자 // 생성자가 하나라도 있으면 기본 생성자를 직접 추가해줘야한다!!!!!!!!!
//        this.brand = brand; //this.은 나 자신을 의미 // b2.brand와 같은 뜻
    }
    public Bike(String brand, String model, int price) { // 서순이 달라도 가능
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Bike(String brand, int price, String model) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Bike(Bike bike) {
        this.brand = bike.brand;
        this.model = bike.model;
        this.price = bike.price;
    }



    void drive() {
        System.out.printf("%s브랜드 %s 모델이 ",brand, model); // 보라색일 경우 생성자를 선택한것
    }
}
