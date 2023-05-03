package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            a *= m;
            a += d;
        }
        System.out.println(a);
    }
}
