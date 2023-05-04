package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] checkerBoard = new int[19][19];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            checkerBoard[sc.nextInt() - 1][sc.nextInt() - 1] = 1;
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++)
                System.out.printf("%d ", checkerBoard[i][j]);
            System.out.println();
        }
    }
}

