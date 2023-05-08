package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class PyramidStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 0; i < height; i++) {
            // ↓ 3 2 1 0 찍고 시작.
            for (int j = 0; j < height - i - 1; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
