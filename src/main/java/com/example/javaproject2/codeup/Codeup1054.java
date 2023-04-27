package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum1 = sc.nextInt();
        int inputNum2 = sc.nextInt();
        boolean result = (inputNum1 == 1 && inputNum2 == 1);
        System.out.printf("%d\n", result ? 1 : 0);

    }
}