package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int computer = sc.nextInt();
        String result;
        if (user == 0 && computer == 1) result = "win";
        else if (user == 1 && computer == 2) result = "win";
        else if (user ==2 && computer==0) result = "win";
        else if (user == computer) result = "tie";
        else result = "lose";

        System.out.println(result);
    }
}
