package com.example.javaproject2.programmers;

public class PlusBigger {
    public static int solution(int a, int b) {
        int str1, str2;
        str1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        str2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        return str1 > str2 ? str1 : str2;
    }

    public static void main(String[] args) {
        System.out.println(solution(12, 3));
    }
}
