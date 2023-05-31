package com.example.javaproject2.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArray2 {
    public static int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        int idx = 0;
        for (int i = l; i <= r; i++) {
            boolean sig = true;
            temp = i;
            while (temp > 0) {
                if (temp % 10 != 0 && temp % 10 != 5) {
                    sig = false;
                    break;
                }
                temp /= 10;
            }
            if (sig) list.add(i);
        }
        if (list.size() == 0) {
            int[] answer = {-1};
            return answer;
        } else {
            int[] answer = new int[list.size()];
            for (int i : list)
                answer[idx++] = i;
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 20)));
    }
}
