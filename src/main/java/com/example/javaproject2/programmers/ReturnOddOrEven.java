package com.example.javaproject2.programmers;

public class ReturnOddOrEven {
    public int solution(int n) {
        int sum = 0;
        if (n % 2 == 1) {
            for (int i = n; i > 0; i-=2){
                sum += i;
            }
        } else {
            for (int i = n; i > 0; i-=2){
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2,2));
    }
}
