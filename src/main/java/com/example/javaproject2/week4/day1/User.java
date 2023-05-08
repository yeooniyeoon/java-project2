package com.example.javaproject2.week4.day1;

public class User {
    String name;
    String phoneNumber; //string인 이유 : int는 0101234에서 맨 앞 0이 저장이 안됨
    int age;

    boolean isAdult() {
        return age >= 18;
    }
}
