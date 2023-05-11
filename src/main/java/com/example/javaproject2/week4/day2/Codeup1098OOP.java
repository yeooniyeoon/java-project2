package com.example.javaproject2.week4.day2;

import java.util.Scanner;

public class Codeup1098OOP {
    private int[][] board;

    public Codeup1098OOP(int x, int y) {
        this.board = board;
    }

    public void printArray(int x, int y) {
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Codeup1098OOP c1098 = new Codeup1098OOP(sc.nextInt(), sc.nextInt());
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (d == 0) {  // d가 0이면 가로, 1이면 세로
                for (int j = 0; j < l; j++) { // 막대에 의해 가려진 경우 1, 아닌 경우 0
                    c1098.board[x][y + j] = 1;
                }
            } else if (d == 1) {
                for (int j = 0; j < l; j++) {
                    c1098.board[x + j][y] = 1;
                }
            }
        }

        //c1098.printArray(board);
    }
}
