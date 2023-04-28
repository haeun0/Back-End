package com.green.java.cho7.poly;
//p.354, 다형성 상속관계에서만 의미 있음
public class Poly {
    /*
        1. 부모타입은 자식 객체 주소값 저장할 수 있다.
        2. 자식타입은 부모 객체 주소값 저장할 수 없다.
        3. 타입은 (알고있는 메소드를 호출할 수 있음)
                 (메소드를 호출할 수 있냐없냐만 결정)
                 >> 실제로 실행되는 건 객체 기준이다.
    */


    public static void main(String[] args) {
        Animal ani1 = new Dog(); //대문자로 시작할 때 부모와 자식인 경우 타입이 달라도 담을수있다. = 상속관계일 때 가능
        ani1.crying(); //자식들을 담을 수는 있어도 자식이 알고있는건 알 수없다.
        //ani1.jump(); //내가 모르는건 불가능

        //Dog dog1 = new Animal(); //But 자식은 부모를 담을 수 없다
        Dog dog1 = (Dog)ani1; // 강제형변환 ani1에는 Dog가 담겨있기 때문에 에러는 안뜸
        dog1.crying();
        dog1.jump(); // 호출가능
    }
}
