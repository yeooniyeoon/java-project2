package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hex = Integer.parseInt(sc.nextLine(), 16);
        System.out.printf("%o", hex);
    }
}
