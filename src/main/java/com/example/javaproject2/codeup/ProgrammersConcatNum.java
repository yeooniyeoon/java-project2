package com.example.javaproject2.codeup;

public class ProgrammersConcatNum {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int answer = Solution.solution(num_list);
        System.out.println(answer);
    }

    class Solution {
        public static int solution(int[] num_list) {
            int answer = 0;
            int oddSum = 0, evenSum = 0;

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0) {
                    evenSum = evenSum * 10 + num_list[i];
                } else {
                    oddSum = oddSum * 10 + num_list[i];
                }
            }
            answer = evenSum + oddSum;
            return answer;
        }
    }
}