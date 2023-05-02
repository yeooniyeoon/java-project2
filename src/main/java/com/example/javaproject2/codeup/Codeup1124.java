package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strArr = input.split("H");
        strArr[0] = strArr[0].substring(1);
        int c = Integer.parseInt(strArr[0]);
        int h = Integer.parseInt(strArr[1]);
        System.out.println((c * 12) + h);
    }
}