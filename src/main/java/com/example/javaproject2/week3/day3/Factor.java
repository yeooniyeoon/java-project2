package com.example.javaproject2.week3.day3;

public class Factor {
    public static void main(String[] args) {
        int n = 7;
        for (int i = n; i > 0; i--) {
            System.out.printf("%d %% %d = %d\n", n, i, n % i);
        }
    }
}
