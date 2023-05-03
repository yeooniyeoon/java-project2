package com.example.javaproject2.codeup;

public class ProgrammersSumOfFactor {
    public static void main(String[] args) {

    }

    public static int solution(int num) {
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}