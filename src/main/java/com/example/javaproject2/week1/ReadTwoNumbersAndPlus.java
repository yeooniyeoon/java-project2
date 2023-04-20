package com.example.javaproject2.week1;

import java.util.Scanner;

public class ReadTwoNumbersAndPlus {
    public void readTwoNumbersAndPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() + sc.nextInt());
    }

    public static void main(String[] args) {
        ReadTwoNumbersAndPlus readTwoNumbersAndPlus = new ReadTwoNumbersAndPlus();
        readTwoNumbersAndPlus.readTwoNumbersAndPlus();
    }
}
