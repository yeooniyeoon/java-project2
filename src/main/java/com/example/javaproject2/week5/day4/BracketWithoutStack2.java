package com.example.javaproject2.week5.day4;

import java.util.Arrays;

public class BracketWithoutStack2 {
    public static void main(String[] args) {
        String brackets = "((()()))())";

        while (brackets.indexOf("()") != -1) {
            String[] split = brackets.split("\\(\\)");
            System.out.println(Arrays.toString(split));
            brackets = String.join("",split);
            System.out.println(brackets);
        }
    }
}
