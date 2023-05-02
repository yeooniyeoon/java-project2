package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, i, j;
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < arrLength - 2; i++) {
            for (j = 0; j < arrLength - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < arrLength; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}