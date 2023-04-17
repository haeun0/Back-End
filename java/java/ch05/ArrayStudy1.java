package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러값을 저장하기 위한 공간
        int n1=1, n2=2, n3=3;
        int[] numArr = {10, 20, 30, 40}; //int형 배열이다.
        //              0번 1번  2번 3번       여러값을 한곳에서 관리할수있다. ex)아파트 몇호실...그래서 0번부터 시작한다.
        int numArr2[] = {10, 20}; //위랑 같음 but 가독성을 위해 위의 모양으로 할것

        numArr[0] = 11; //방번호를 11로 바꾼다.
        int num = numArr[1]; //1번방의 번호를 가져온다, num : 20
        System.out.println("num : " + num);

    }
}
