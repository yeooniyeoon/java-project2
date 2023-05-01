package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputChar = sc.nextLine().charAt(0);
        for (char c = 'a'; c <= inputChar; c++) {
            System.out.printf("%c ", c);
        }
    }
}
