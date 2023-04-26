package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void fillRow(int[][] arr, int rowNum) {
        for (int i = 0; i < arr.length; i++) {
            arr[rowNum][i] = 1;
        }
        printTdimArr(arr);
    }

    public static void printTdimArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("---------------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillRow(arr, 1);
        fillRow(arr, 2);
    }
}

