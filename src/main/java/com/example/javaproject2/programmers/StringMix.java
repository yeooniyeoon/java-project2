package com.example.javaproject2.programmers;

public class StringMix {
    public static String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String a = "aaaaa";
        String b = "bbbbb";
        System.out.println(StringMix.solution(a, b));
    }
}
