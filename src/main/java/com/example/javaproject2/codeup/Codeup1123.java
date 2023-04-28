package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        float fahrenheit = ((9/5)*celsius)+32;
        System.out.printf("%.3f\n", fahrenheit);
    }
}
