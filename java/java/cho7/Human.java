package com.green.java.cho7;

public class Human {
    private String name;
    private int age;
    private String job;

    public Human() {
        super();
    }

    public Human(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void setName(String name) {
        this.name = name; // 이름이 같은경우 가까운것을 가져오기 때문에 위에 name에 접근 하기위해서this.을 적어준다.
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getJob() {
        return this.job;
    }


}
