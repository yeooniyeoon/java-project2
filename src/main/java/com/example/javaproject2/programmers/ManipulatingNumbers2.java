package com.example.javaproject2.programmers;

public class ManipulatingNumbers2 {
    public static String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - numLog[i - 1]) {
                case 1 -> answer += "w";
                case -1 -> answer += "s";
                case 10 -> answer += "d";
                case -10 -> answer += "a";
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
