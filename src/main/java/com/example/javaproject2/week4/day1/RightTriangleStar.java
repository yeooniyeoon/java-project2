package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class RightTriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}