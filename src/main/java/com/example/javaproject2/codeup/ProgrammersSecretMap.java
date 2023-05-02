package com.example.javaproject2.codeup;

public class ProgrammersSecretMap {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] str = solution(5, arr1, arr2);
    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        for (int i = 0; i < n; i++){
            System.out.println(Integer.toBinaryString(arr1[i]));

            //boolean b = arr1[i] | arr2[i];

            //answer[i] += arr1[i] | arr2[i]


        }
        return answer;
    }
}