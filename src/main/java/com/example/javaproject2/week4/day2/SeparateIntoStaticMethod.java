package com.example.javaproject2.week4.day2;

import java.util.Arrays;

public class SeparateIntoStaticMethod {
    public static void printArray(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("===========");
    }
    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        printArray(arr);

        arr[0][0] = 0;
        arr[1][1] = 0;
        arr[2][2] = 0;
        printArray(arr);

        arr[1][1] = 5;
        printArray(arr);

    }
}
