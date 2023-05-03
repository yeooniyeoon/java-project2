package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        while (input > 9) {
            sum += input % 10;
            input /= 10;
        }
        sum += input;
        while (sum > 9) {
            input = sum % 10;
            sum /= 10;
            input += sum;
            sum = input;
        }
        System.out.println(sum);
    }

    public static int digitSum()
}