package com.example.javaproject2.programmers;

import java.util.Scanner;

public class ChangeCase181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 97) {
                ch = str.charAt(i);
                ch += 32;
                System.out.printf("%c", ch);
            } else {
                ch = str.charAt(i);
                ch -= 32;
                System.out.printf("%c", ch);
            }
        }
    }
}