package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSum = sc.nextInt();
        int sum = 0;

        for (int i = 1; true; i++) {
            sum += i;
            System.out.println(sum);
            if (sum == inputSum) {
                System.out.println(i);
                break;
            }
        }
    }
}