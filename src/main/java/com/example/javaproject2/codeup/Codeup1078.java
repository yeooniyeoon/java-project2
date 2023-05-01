package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= inputNum; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
