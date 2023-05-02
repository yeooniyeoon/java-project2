package com.example.javaproject2.codeup;

public class ProgrammersSpecial2DimArray {
    public static void main(String[] args) {

    }

    public int[][] solution(int n) {
        int[][] answer = {};
        for(int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}
