package com.example.javaproject2.babyLion;

public class Computer extends Product {

    public Computer(int price) {
        super(price);
    }

    @Override
    void print() {
        System.out.println("나 컴퓨터");
    }
}
