package com.example.javaproject2.week4.day1;

public class Calculator {
    public static int printPlus(int kor, int eng, int math) {
        return (kor + eng + math) / 3;
    }

    public static void main(String[] args) {
        int kor = 78;
        int eng = 90;
        int math = 82;
        System.out.printf("평균 : %d\n", printPlus(kor, eng, math));
    }
}
