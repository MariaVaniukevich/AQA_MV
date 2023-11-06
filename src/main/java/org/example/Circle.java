package org.example;

public class Circle implements Shape {

    private double radius;
    private String borderCol;
    private String fillCol;

    public Circle(double radius, String borderCol, String fillCol) {
        this.radius = radius;
        this.borderCol = borderCol;
        this.fillCol = fillCol;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public String borderColor() {
        return borderCol;
    }

    @Override
    public String fillColor() {
        return fillCol;
    }
}
