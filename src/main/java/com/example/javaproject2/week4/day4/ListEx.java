package com.example.javaproject2.week4.day4;

import com.example.javaproject2.week4.day3.ConsolePrinter;
import com.example.javaproject2.week4.day3.Printer;
import com.example.javaproject2.week4.day3.Printer2;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        Printer2 pt2 = new ConsolePrinter();
        List l1 = new ArrayList();
        l1.add("Hello");
        l1.add(1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        System.out.println("");
        for (var item : l1) {
            System.out.println(item);
        }
    }
}
