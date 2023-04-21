package com.green.java.cho7;

public class ChildTest2 {
    public static void main(String[] args) {
        Child ch = new Child(10);
        ch.age = 20;
        
        System.out.printf("super: %d\n", ch.getSuperAge()); // Parent의 age
        System.out.printf("this: %d\n", ch.getThisAge()); // 나 Child의 age
        // this를 사용할 때 나한테 age가 없으면 부모 Parent로 올라가서 부모의 age에 20을 저장
        // Super로 age를 호출하면 부모의 age를 가져오고
        // This로 age를 호출하는데 나한테 없을때 올라가서 부모의 age를 가져온다.
        // 둘다 부모 Parent의 age 20을 출력
    }
}
