package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputVal;
        for (int i = 0; true ; i++) {
            inputVal = sc.nextInt();
            if (inputVal == 0) {
                break;
            }
            System.out.println(inputVal);
        }
    }
}
