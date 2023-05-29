package com.example.javaproject2.programmers;

public class LastTwoElements {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = num_list[len - 1] > num_list[len - 2] ?
                num_list[len - 1] - num_list[len - 2] : 2 * num_list[len - 1];
        return answer;
    }
}
