package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if (val > 0) {
            System.out.println("plus");
            if (val % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else {
            System.out.println("minus");
            if (val % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
