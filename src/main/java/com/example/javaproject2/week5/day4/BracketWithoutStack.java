package com.example.javaproject2.week5.day4;

public class BracketWithoutStack {
    public static void main(String[] args) {
        String brackets = "(((()))))";

        while (brackets.indexOf("()") != -1) {
            brackets = brackets.replace("()", "");
        }

    }
}
