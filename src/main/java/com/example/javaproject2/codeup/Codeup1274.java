package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String isFactor = "prime";

        /*
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isFactor = "not prime";
                break;
            }
        }
        System.out.println(isFactor);
        */

        // 루트 num까지
        /*
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isFactor = "not prime";
                break;
            }
        }
        System.out.println(isFactor);
        */

        // num / 2까지
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isFactor = "not prime";
                break;
            }
        }
        System.out.println(isFactor);
    }
}

