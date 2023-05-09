package com.example.javaproject2.week4.day2;

public class MultiplicationTableMethod {
    private String multipleSymbol = "";

    public MultiplicationTableMethod(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printDan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        MultiplicationTableMethod mt = new MultiplicationTableMethod("x");
        mt.printDan(2);
        mt.printDan(5);
        MultiplicationTableMethod mt2 = new MultiplicationTableMethod("*");
        mt2.printDan(7);
        mt2.printDan(8);
    }
}
