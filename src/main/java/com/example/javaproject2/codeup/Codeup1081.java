package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int outerDice = sc.nextInt();  // 바깥쪽 주사위. 나중에 바뀜
        int innerDice = sc.nextInt();  // 안쪽 주사위. 자주 바뀜

        // 바깥쪽 3번, 안쪽 2번
        for (int i = 1; i <= outerDice; i++) {
            for (int j = 1; j <= innerDice; j++) {
                System.out.printf("%d %d\n", outerDice, innerDice);
            }
        }
    }
}
