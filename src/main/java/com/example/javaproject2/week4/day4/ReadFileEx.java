package com.example.javaproject2.week4.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader
                ("C:\\Users\\pc\\Desktop\\1.병원정보서비스 2022.10..csv"));
        System.out.println(br.readLine());
    }
}
