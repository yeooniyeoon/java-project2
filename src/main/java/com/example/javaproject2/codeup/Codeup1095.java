package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int min = 23;
        int temp;

        for (int i = 0; i < cnt; i++) {
            temp = sc.nextInt();
            if (min > temp) min = temp;
        }
        System.out.println(min);
    }
}
