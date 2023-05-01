package com.example.javaproject2.codeup;

import java.util.Scanner;

public class ProgrammersDiceGame2 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        answer = Solution.solution(a, b, c);
        System.out.println(answer);
    }

    static class Solution {
        public static int solution(int a, int b, int c) {
            int answer = 0;
            if (a != b && a != c && b != c) {
                answer = a + b + c;
            } else if (a == b && a == c && b == c) {
                answer = (a + b + c) * ((int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)))
                        * ((int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
            } else if (a == b || a == c || b == c) {
                answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
            }
            return answer;
        }
    }
}
