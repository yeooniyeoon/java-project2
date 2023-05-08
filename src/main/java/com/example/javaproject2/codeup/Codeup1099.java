package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mazeBox = new int[10][10];
        System.out.printf("mazebox.length : %d, mazebox[i].length : %d\n", mazeBox.length, mazeBox[1].length);
        for (int i = 0; i < mazeBox.length; i++) {  // 미로 상자 입력받기
            for (int j = 0; j < mazeBox[i].length; j++) {
                mazeBox[i][j] = sc.nextInt();
            }
        }

        int x = 1, y = 1;   // 개미는 (2,2)에서 출발.



        do {
            mazeBox[x][y] = 9;  // 현재 위치 9로 변경
            if (mazeBox[x][y + 1] != 1) y += 1;
            else if (mazeBox[x + 1][y] != 1) x += 1;
        } while ((x < 9 || y < 9) && !((mazeBox[x][y + 1] == 1) && (mazeBox[x + 1][y] == 1)) && mazeBox[x][y] != 2);

        mazeBox[x][y] = 9;



/*

        1 1 1 1 1 1 1 1 1 1
        1 0 0 1 0 0 0 0 0 1
        1 0 0 1 1 1 0 0 0 1
        1 0 0 0 0 0 0 1 0 1
        1 0 0 0 0 0 0 1 0 1
        1 0 0 0 0 1 0 1 0 1
        1 0 0 0 0 1 2 1 0 1
        1 0 0 0 0 1 0 0 0 1
        1 0 0 0 0 0 0 0 0 1
        1 1 1 1 1 1 1 1 1 1
*/


        /*
        while (x < 9 || y < 9) {
            mazeBox[x][y] = 9;
            if (mazeBox[x][y + 1] == 2) { // 오른쪽에 먹이가 있는 경우
                mazeBox[x][y + 1] = 9;
                break;
            }
            else if (mazeBox[x + 1][y] == 2) { // 아래쪽에 먹이가 있는 경우
                mazeBox[x + 1][y] = 9;
                break;
            }
            else if (mazeBox[x][y + 1] == 0) x += 1;
            else if (mazeBox[x + 1][y] == 0) y += 1;
            else break; // 더 이상 움직일 수 없는 경우
        }
        */



        for (int i = 0; i < mazeBox.length; i++) {
            for (int j = 0; j < mazeBox[i].length; j++) {
                System.out.printf("%d ", mazeBox[i][j]);
            }
            System.out.println("");
        }
    }
}
