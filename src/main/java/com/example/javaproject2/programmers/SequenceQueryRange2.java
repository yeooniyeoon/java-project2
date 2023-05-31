package com.example.javaproject2.programmers;

import java.util.Arrays;

public class SequenceQueryRange2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {
                {0, 4, 2},
                {0, 3, 2},
                {0, 2, 2}
        };

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        // s = queries[i][0], e = queries[i][1], k = queries[i][2];
        // arr[queries[i][0] ~ arr[queries[i][1]
        for (int i = 0; i < queries.length; i++) {
            int min = 1000000;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && min > arr[j])
                    min = arr[j];
            }
            if (min == 1000000) answer[i] = -1;
            else answer[i] = min;
        }
        return answer;
    }
}
