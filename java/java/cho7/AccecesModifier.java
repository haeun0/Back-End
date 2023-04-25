package com.green.java.cho7;

public class AccecesModifier {
    /*
    private, default, protected, public // ->->접근할수있는 범위가 늘어난다
    */

    public static void main(String[] args) {
        ModifierTest mt1 = new ModifierTest();
        // mt1.num1 = 10; // private 이라 접근 불가능
        mt1.num2 = 20; // int 같은 패키지라 접근 가능 //package com.green.java.cho7;
        mt1.num3 = 30;
        mt1.num4 = 40; // public 무조건 접근 가능
    }
}


