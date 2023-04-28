package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        System.out.printf("%.1f\n", (float)base*height/2);
    }
}
