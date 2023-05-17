package com.example.javaproject2.babyLion;

public class Store {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Tv tv = new Tv(2000);
        Computer computer = new Computer(1000);

        //업캐스팅
        Product ptv = new Tv(2000); //오버라이딩

        //다운캐스팅
        ((Tv)ptv).test();
        buyer.buy(tv);
        buyer.buy(computer);
        // 바이어가 구매 시 장바구니로 상품목록이 생성되어야 함.
    }
}

