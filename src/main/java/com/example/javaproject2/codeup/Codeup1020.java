package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        System.out.print(id.substring(0, 6));
        System.out.print(id.substring(7, 14));
    }
}

