package com.example.javaproject2.codeup;

public class SecretMap {
    public static void main(String[] args) {

    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        for (int i = 0; i < n; i++){
            answer[i] = arr1[i] | arr2[i] ? "#" : " ";
        }
        return answer;
    }
}