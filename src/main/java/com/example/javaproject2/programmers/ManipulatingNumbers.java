package com.example.javaproject2.programmers;

public class ManipulatingNumbers {
    public static int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w' -> n += 1;
                case 's' -> n -= 1;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));

    }
}
