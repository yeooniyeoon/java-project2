package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("*".repeat(num));
    }
}
