package com.example.javaproject2.codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int cnt = red * green * blue;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int r = 0; r < red; r++) {
            for (int g = 0; g < green; g++) {
                String str = "";
                for (int b = 0; b < blue; b++) {
                    str += r + " " + g + " " + b + "\n";
                }
                bw.write(str);
                bw.flush();

            }
        }
        System.out.println(cnt);
    }
}