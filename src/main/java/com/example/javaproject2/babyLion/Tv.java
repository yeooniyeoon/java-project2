package com.example.javaproject2.babyLion;

public class Tv extends Product{

    public Tv(int price) {
        super(price);
    }

    @Override
    void print() {
        System.out.println("나 티비");
    }

    void test() {
        System.out.println("티비 테스트");
    }
}
