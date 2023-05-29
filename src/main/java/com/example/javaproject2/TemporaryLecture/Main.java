package com.example.javaproject2.TemporaryLecture;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(3.5);

        double area1 = rectangle.calculateArea();
        double perimeter1 = rectangle.calculatePerimeter();

        double area2 = circle.calculateArea();
        double perimeter2 = circle.calculatePerimeter();

        System.out.printf("사각형의 넓이 : %f\n", area1);
        System.out.printf("사각형의 둘레 : %f\n", perimeter1);
        System.out.printf("원의 넓이 : %f\n", area2);
        System.out.printf("원의 둘레 : %f\n", perimeter2);

    }
}
