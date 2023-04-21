package com.green.java.ch06;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod(); // 객체화를 먼저!
        mm.sum(10,20); // 메소드를 호출 한다. viod는 한줄에 있어야 한다. 양옆에 다른것 X
        mm.sum(10,20);
        mm.sum(10,223);
        mm.sum(20,223);

        int result = mm.sum2(10, 245); //리턴 메소드는 양옆에 다른게 있어도됨, 호출한 부분이 값이된다.
        System.out.println("result : "+ result);

/*        PrintStream ps = Syetem.out;
        ps.println("result : \"+ result");*/
    }


}
