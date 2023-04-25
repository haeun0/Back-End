package com.green.java.cho7;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireCar fc = null;

        car.drive();
        // fc = (FireCar)car; //부모를 담을수 없기 때문에 에러가 난다.
    }
}
