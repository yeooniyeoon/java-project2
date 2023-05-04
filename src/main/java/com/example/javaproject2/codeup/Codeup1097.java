package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] checkerBoard = new int[20][20];

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                checkerBoard[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();  // 입력받을 좌표의 개수
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 1; j < 20; j++) {
                checkerBoard[x][j] = checkerBoard[x][j] == 0 ? 1 : 0;
                checkerBoard[j][y] = checkerBoard[j][y] == 0 ? 1 : 0;
            }
        }

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d ", checkerBoard[i][j]);
            }
            System.out.println("");
        }
    }
}