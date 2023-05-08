package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floor = sc.nextInt();
        for (int i = 1; i <= floor; i++) {
            for (int j = 0; j < i - 1; j++)
                System.out.printf(" ");
            System.out.printf("**\n");
        }
    }
}
