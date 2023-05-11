package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        // strList.add(1); String만 추가 가능
        strList.add("banga");

        for (String s : strList) {
            System.out.println(s.split(""));
        }
    }
}
