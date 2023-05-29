package com.example.javaproject2.TemporaryLecture;

public class Rectangle implements Shape {
    private double weight;
    private double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return weight * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (weight + height);
    }
}
