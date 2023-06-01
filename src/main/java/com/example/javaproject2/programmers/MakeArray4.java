package com.example.javaproject2.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArray4 {
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (list.isEmpty())
                list.add(arr[i++]);
            else if (list.get(list.size() - 1) < arr[i])
                list.add(arr[i++]);
            else if (list.get(list.size() - 1) >= arr[i])
                list.remove(list.size() - 1);
        }
        int[] stk = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            stk[j] = list.get(j);
        }
        return stk;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(solution(arr)));
    }

}
