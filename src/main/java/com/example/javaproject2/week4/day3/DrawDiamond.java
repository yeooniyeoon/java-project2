package com.example.javaproject2.week4.day3;

import com.example.javaproject2.week4.day2.ShapeDrawer;
import javafx.scene.shape.Shape;

public class DrawDiamond extends ShapeDrawer {
    public static String getRepeatSymbol(String symbol, int n) {
        String str = "";
        for (int i = 0; i < n; i++) str += symbol;
        return str;
    }

    public void printShape(int h) {
        for (int i = 0; i < h; i++) {
            System.out.printf(makeALine(h, i));
        }
    }

    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot)
            return String.format("%s%s\n", getRepeatSymbol("0", -2 + h - i - 2), getRepeatSymbol("*", 2 * i + 1));
        else
            return String.format("%s%s\n", getRepeatSymbol("0", i - pivot), getRepeatSymbol("*", 2 * (h - i) - 1));
    }

    public static void main(String[] args) {
        DrawDiamond drawDiamond = new DrawDiamond();
        int h = 5;
        drawDiamond.printShape(h);

    }
}
