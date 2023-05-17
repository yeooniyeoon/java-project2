package com.example.javaproject2.babyLion;

public abstract class Product {
    int price;
    boolean power;

    public Product(int price){
        this.price = price;
    }

    public void power() {
        this.power = !power;
    }

    abstract void print();

    @Override
    public String toString() {
        return "Product{ " +
                "price : " + price +
                " power : " + power +
                " }";
    }
}
