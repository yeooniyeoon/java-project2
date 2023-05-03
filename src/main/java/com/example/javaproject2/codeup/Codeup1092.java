package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visitCycleA = sc.nextInt();
        int visitCycleB = sc.nextInt();
        int visitCycleC = sc.nextInt();
        int day = 1;
        while (day % visitCycleA != 0 || day % visitCycleB != 0 || day % visitCycleC != 0) {
            day++;
        }
        System.out.println(day);
    }
}
