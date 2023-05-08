package com.example.javaproject2.week3.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AntEx {

    public static void printArr3(String[][] arr) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%s ", arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 지도를 배열에 입력 10 * 10

        String[][] arr = new String[10][10];
        for (int i = 0; i < 10; i++) {
            arr[i] = br.readLine().split(" ");
        }

        // 이동하고 찍을지
        // 이동 하면서 찍을지
        // 지금이 0이 아니고 다음이 1이 아니어야함
        int x = 1;
        int y = 1;
        int cnt = 0;
        while (cnt < 100){
            if("2".equals(arr[y][x])){
                arr[y][x] = "9";
                break;
            } else if (x < 9 && "0".equals(arr[y][x]) && !"1".equals(arr[y][x+1])) {
                arr[y][x++] = "9";
            } else if(y < 9 && "0".equals(arr[y][x]) && "1".equals(arr[y][x+1])) {
                arr[y++][x] = "9";
            }
        }
        printArr3(arr);
    }
}