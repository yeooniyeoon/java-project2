package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 28, 2, 3, 9, 11};
        // i j j-1
        // 1 1 0
        // 2 2 1
        // 2 1 2
        // 3 3 2
        // 3 2 1
        // 3 1 0
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
