package com.example.javaproject2.TemporaryLecture;

import static java.lang.Math.PI;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * PI;
    }
}
