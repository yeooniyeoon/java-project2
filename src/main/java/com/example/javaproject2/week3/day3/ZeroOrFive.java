package com.example.javaproject2.week3.day3;

public class ZeroOrFive {
    public static void main(String[] args) {
        int num = 5505;
        int cnt = 0;
        String flagText = "0과 5로만 구성된 숫자입니다.";

        while (num > 0) {
            int remainder = num % 10;
            if (remainder % 5 != 0) {
                flagText = "0과 5로만 구성된 숫자가 아닙니다.";
                break;
            }
            num /= 10;
        }
        System.out.println(flagText);
    }
}
