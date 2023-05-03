package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1073 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        for (int i = 0; true; i++) {
            inputNum = sc.nextInt();
            if (inputNum == 0)
                break;
            System.out.println(inputNum);
        }
        */

        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            System.out.println(num);
        }

    }
}
