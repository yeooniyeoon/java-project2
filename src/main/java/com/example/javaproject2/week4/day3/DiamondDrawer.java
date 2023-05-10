package com.example.javaproject2.week4.day3;

import com.example.javaproject2.week4.day2.ShapeDrawer;

public class DiamondDrawer extends ShapeDrawer {
    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot)
            return String.format("%s%s\n", " ".repeat(-2 + h - i - 2), "*".repeat(2 * i + 1));
        else
            return String.format("%s%s\n", " ".repeat(i - pivot), "*".repeat(2 * (h - i) - 1));
    }

    public static void main(String[] args) {
        ShapeDrawer diamond = new DiamondDrawer();
        diamond.printShape(7);
    }
}
