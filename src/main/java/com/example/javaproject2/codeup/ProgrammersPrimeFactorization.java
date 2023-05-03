package com.example.javaproject2.codeup;

import java.util.Arrays;

public class ProgrammersPrimeFactorization {
    public static int[] solution(int n) {
        int[] tempArr = new int[n / 2];
        int idx = 0;
        for (int i = 2; i <= n; i++) { // n의 약수 구하기
            boolean isPrime = true;
            if (n % i == 0) {
                for (int j = 2; j < i; j++) { // 해당 약수가 소수인지 판별
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) { // 소수면 arr에 추가
                    tempArr[idx] = i;
                    idx++;
                }
            }
        }
        int[] answer = new int[idx];
        for (int i = 0; i < idx; i++)
            answer[i] = tempArr[i];
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = solution(210);
        System.out.println(Arrays.toString(arr));
    }
}
