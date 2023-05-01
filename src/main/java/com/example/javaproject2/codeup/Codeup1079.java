package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; true; i++) {
            char inputChar = sc.next().charAt(0);
            System.out.println(inputChar);
            if (inputChar == 'q') {
                break;
            }
        }
    }
}
