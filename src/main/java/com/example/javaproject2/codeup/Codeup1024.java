package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.nextLine();
        for (int i = 0; i < inputWord.length(); i++) {
            System.out.printf("\'%c\'\n", inputWord.charAt(i));
        }
    }
}
