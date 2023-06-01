package com.example.javaproject2.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollatzSequence {
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        while (n != 1) {
            list.add(n);
            n = n % 2 == 0 ? (n / 2) : (3 * n + 1);
        }
        list.add(1);
        int[] answer = new int[list.size()];
        for (int i : list)
            answer[idx++] = i;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }
}
