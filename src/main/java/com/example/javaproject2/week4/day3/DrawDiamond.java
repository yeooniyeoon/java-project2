package com.example.javaproject2.week4.day3;

public class DrawDiamond {
    public static String getRepeatSymbol(String symbol, int n) {
        String str = "";
        for (int i = 0; i < n; i++) str += symbol;
        return str;
    }

    public static String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot)
            return String.format("%s%s\n", getRepeatSymbol("0", -2 + h - i - 2), getRepeatSymbol("*", 2 * i + 1));
        else
            return String.format("%s%s\n", getRepeatSymbol("0", i - pivot), getRepeatSymbol("*", 2 * (h - i) - 1));
    }

    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if (i <= pivot) makeALine(h, i);
            else makeALine(h, i);
        }
    }
}
