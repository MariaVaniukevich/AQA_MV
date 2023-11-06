package org.example;

public class Rectangle implements Shape {
    private double height;
    private double width;
    private String borderCol;
    private String fillCol;

    public Rectangle(double height, double width, String borderCol, String fillCol) {
        this.height = height;
        this.width = width;
        this.borderCol = borderCol;
        this.fillCol = fillCol;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String borderColor() {
        return borderCol;
    }

    @Override
    public String fillColor() {
        return fillCol;
    }
};
