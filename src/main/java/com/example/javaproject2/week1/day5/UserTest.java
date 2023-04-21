package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User yeoon = new User();
        yeoon.name = "유채연";
        yeoon.phoneNumber = "010-1234-5678";
        yeoon.age = 24;
        System.out.printf("%s님은 성인입니까? %s\n", yeoon.name, yeoon.isAdult());
        yeoon.isAdult();

        User jaesung = new User();
        jaesung.name = "재성 매니저님";
        jaesung.phoneNumber = "010-1234-5678";
        jaesung.age = 24;
        System.out.printf("%s님은 성인입니까? %s\n", jaesung.name, jaesung.isAdult());
    }
}