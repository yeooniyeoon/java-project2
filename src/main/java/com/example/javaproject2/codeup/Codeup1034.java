package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.nextLine();
        int iDecimal = Integer.parseInt(octal, 8);
        System.out.printf("%d", iDecimal);
    }
}
