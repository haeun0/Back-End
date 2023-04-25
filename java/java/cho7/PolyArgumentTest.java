package com.green.java.cho7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Product p = new Product(100);
        Tv2 tv = new Tv2();
        Computer com = new Computer();
        Buyer buyer = new Buyer();

        buyer.buy(tv); // Tv을(를) 100만원에 구매하였습니다.
        buyer.buy(com); // Computer을(를) 100만원에 구매하였습니다.

        buyer.printState(); //나의 남은 돈은 700만원 입니다.

    }
}
class Buyer {
    private int money;
    private int bonusPoint;

    public Buyer() {
        this.money = 1000;
        this.bonusPoint = 0;
    }

    public void buy(Product p) {

    /*  줄여서
        int productPrice = p.getPrice();
        money = money - productPrice;*/

        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();
        System.out.printf("%s을(를) %d만원에 구매하였습니다.\n", p.toString(), p.getPrice()); //.toString()생략가능
    }

    public void printState() {
        System.out.printf("나의 남은 돈은 %,d만원 입니다. 보너스 점수는 %,d점 입니다\n", this.money, this.bonusPoint);
    }

}




class Product {
    protected int price;
    protected int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price * 0.1 );
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}


class Tv2 extends Product {
    public Tv2() {
        super(100);
    }

    
    public String toString() { //toString() Overriding을 위해 만들어줌..? 주소값이 아니라 객체를 출력하기 위해
        return "Tv";
    }
}


class Computer extends Product {
    public Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}




