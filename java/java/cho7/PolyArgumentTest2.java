package com.green.java.cho7;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        b.buy(new Tv3());
        b.buy(new Computer3());
        b.buy(new Audio3());
        b.buy(new Audio3());
        b.summary();//구입하신 제품은 Tv,Computer, Audio, Audio 총 4개 입니다.
        b.printState();
    }
}

class Buyer3 {
    private int money;
    private int bonusPoint;
    private Product3[] items; //구매목록
    private int idx; //구매한 개수

    public Buyer3() {
        this.money = 1000;
        this.bonusPoint = 0;
        this.items = new Product3[10];
        this.idx = 0;
        printState();
    }

    public void buy(Product3 p) {

    /*  줄여서
        int productPrice = p.getPrice();
        money = money - productPrice;*/
        items[idx++] = p;
        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();
        
    /*  좋지않은.. 너무많이 계산해야됨
        for(int i = 0; i < items.length;i++) {
            if (items[i] == null) {
                items[i] = p;
                break;
            }
        }*/

        System.out.printf("%s을(를) %d만원에 구매하였습니다.\n", p.toString(), p.getPrice()); //.toString()생략가능

    }

    public void summary() {

        System.out.print("구입하신 제품은 ");
        //좋은 퍼포먼스 코드-----------
        if(idx > 0) {
            System.out.printf("%s", items[0]);
            for (int i = 1; i < idx; i++) {
                System.out.printf(", %s", items[i]);
            }
        } 
        
    /*  좋지 않은 퍼포먼스 코드------------
        for (int i = 0; i < idx; i++) {
            if(i !=0) {
                System.out.print(", ");
            }
            System.out.print(items[i]);
        }
    */
        System.out.printf(" 총 %,d개 입니다\n", idx);
    }

    public void printState() {
        System.out.printf("나의 현재 돈은 %,d만원 입니다. 보너스 점수는 %,d점 입니다\n", this.money, this.bonusPoint);
    }



}




class Product3 {
    protected int price;
    protected int bonusPoint;

    Product3(int price) {
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


class Tv3 extends Product3 {
    public Tv3() {
        super(100);
    } //생성자... 생성자와 메서드의 다른점??


    public String toString() { //toString() Overriding을 위해 만들어줌..? 주소값이 아니라 객체를 출력하기 위해
        return "Tv";
    } //오브젝트의 메서드를 오버라이딩
}


class Computer3 extends Product3 {
    public Computer3() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio3 extends Product3 {
    public Audio3() {super(50);}

    public String toString() {return "Audio";}
}

