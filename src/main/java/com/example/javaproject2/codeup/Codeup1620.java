package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static int sumOfDigit(int num) {
        int sum = 0;
        while (num > 9) {
            sum += num % 10;
            num /= 10;
        }
        sum += num;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        input = sumOfDigit(input);
        while (input > 9)
            input = sumOfDigit(input);
        System.out.println(input);
    }
}
