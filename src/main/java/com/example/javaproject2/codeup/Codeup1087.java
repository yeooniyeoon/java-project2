package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum +=i;
            if (sum >= num) {
                break;
            }
        }
        System.out.println(sum);
    }
}
