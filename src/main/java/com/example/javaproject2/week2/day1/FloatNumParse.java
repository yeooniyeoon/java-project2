package com.example.javaproject2.week2.day1;

public class FloatNumParse {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2);

        float fResult = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("fReulst = " + fResult);

        int iResult = Integer.parseInt(val1) + Integer.parseInt(val2);
        System.out.println("iResult : " + iResult);

    }
}
