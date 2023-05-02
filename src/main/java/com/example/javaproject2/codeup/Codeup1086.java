package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%.2f MB\n", (float) (w * h * b) / 8 / 1024 / 1024);
    }
}
