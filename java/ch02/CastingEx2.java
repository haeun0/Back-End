package com.green.java.ch02;

public class CastingEx2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;
//        double a = (double)n1 / n2;
//        System.out.println(a);

        //10을 3으로 나눠서 소수점이 나타나도록 해주세요.
        //3.0이 나오지 않도록 해주세요.
        
//        책에 있는 계산식사용
//        double a = (double)n1;
//        double b = (double)n2;
//        System.out.printf("%f / %f = %f %n", a, b, a / b);
//        System.out.printf("%f / %f = %f", a, b, a / b);

//        System.out.printf("%f / %d = %f%n", (float)n1, n2, (float)n1 / n2);




//        계산식이 되는지 확인용 그냥 int로 계산해보기
//        System.out.printf("%d / %d = %d%n", n1, n2, n1 / n2);
        
        
        //선생님코드
        double a = (double)n1 / n2;
        System.out.printf("%.3f\n", a);

    }
}
