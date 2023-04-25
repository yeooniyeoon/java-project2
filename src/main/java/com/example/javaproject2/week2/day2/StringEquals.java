package com.example.javaproject2.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD");

        String str1 = "GOLD";
        String str2 = "G";

        System.out.println("GOLD -->" + str1.hashCode());
        System.out.println("G -->" + str2.hashCode());
        System.out.println(str1.substring(0, 1) == str2);
        System.out.println(str1.substring(0, 1).equals(str2));
    }
}
