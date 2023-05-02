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
            int oddCnt = 0; // 홀수 자릿수 카운트
            int evenCnt = 0; // 짝수 자릿수 카운트

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0) {
                    evenSum += evenSum * Math.pow(10, evenCnt) + num_list[i];
                    evenCnt++;
                } else {
                    oddSum += oddSum * Math.pow(10, oddCnt) + num_list[i];
                    oddCnt++;
                }
            }
            answer = evenSum + oddSum;
            System.out.println(evenSum);
            System.out.println(oddSum);
            return answer;
        }
    }
}