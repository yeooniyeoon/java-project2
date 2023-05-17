package com.example.javaproject2.babyLion;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
    private int money = 10000;
    private List<Product> buyList = new ArrayList<>();

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money > 0) {
            this.money = money;
        }
    }

    public void addBuyList(Product ptv) {
        this.buyList.add(ptv);
        System.out.println(buyList);
    }

    public void buy(Product ptv) {
        if (money >= ptv.price) {
            this.money -= ptv.price;
            addBuyList(ptv);
        }
        System.out.println(money);
    }
}
