package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        int num3 = Integer.parseInt(str[2]);
        System.out.printf("%d\n", num1 + num2 + num3);
        System.out.printf("%.1f", (float)(num1 + num2 + num3) / 3);
    }
}