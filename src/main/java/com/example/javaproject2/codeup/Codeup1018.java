package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(":");
        System.out.printf("%s:%s", strArr[0], strArr[1]);
    }

}