package com.example.javaproject2.programmers;

public class ConditionString {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;


        if (ineq.equals(">")) {
            if (eq.equals("=")) answer = n >= m ? 1 : 0;
            else answer = n > m ? 1 : 0;
        }
        else if (ineq.equals("<")) {
            if (eq.equals("=")) answer = n <= m ? 1 : 0;
            else answer = n < m ? 1 : 0;
        }

        return answer;
    }
}
