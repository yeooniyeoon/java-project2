package com.example.javaproject2.programmers;

public class StringOverWrite181943 {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(StringOverWrite181943.solution("He11oWor1d", "lloWorl", 2));
    }
}
