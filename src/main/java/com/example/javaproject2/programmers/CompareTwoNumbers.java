package com.example.javaproject2.programmers;

public class CompareTwoNumbers {
    public static int solution(int a, int b) {
        int str1, str2;
        str1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        str2 = 2 * a * b;

        return str1 > str2 ? str1 : str2;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 91));

    }
}
