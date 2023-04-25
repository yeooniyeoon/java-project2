package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        String[] strArr = sc.nextLine().split("\\.");
        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int date = Integer.parseInt(strArr[2]);
        System.out.printf("%02d-%02d-%04d", date, month, year);
    }
}
