package com.example.javaproject2.week5.day2;

import java.util.Arrays;

// 숫자, 알파벳 다 되도록
public class InsertionSort04 {
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((isAscending ? arr[j - 1] - arr[j] : arr[j] - arr[j - 1]) > 0) { // 내림차순
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else break;
            }
        }
        return arr;
    }
    public int[] sort(int[] arr) {
        return sort(arr, true);
    }

    public static void main(String[] args) {
        int[] iArr = {7, 28, 2, 3, 9, 11};
        char[] cArr = {'a', 'h', 'y', 'c'};
        InsertionSort04 is = new InsertionSort04();
        iArr = is.sort(iArr);
        // cArr = is.sort(cArr);
        System.out.println(Arrays.toString(iArr));
    }
}
