package com.example.javaproject2.codeup;

import java.util.Arrays;

public class ProgrammersSpecial2DimArray {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = solution(n);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}
