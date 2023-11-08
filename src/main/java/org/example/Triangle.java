package org.example;

public class Triangle implements Shape {
    private double sideBase;
    private double side2;
    private double side3;
    private double height;
    private String borderCol;
    private String fillCol;

    public Triangle(double sideBase, double side2, double side3, double height,
                    String borderCol, String fillCol) {
        this.sideBase = sideBase;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
        this.borderCol = borderCol;
        this.fillCol = fillCol;
    }


    @Override
    public double perimeter() {
        return (sideBase + side3 + side2);
    }

    @Override
    public double area() {
        return 0.5 * sideBase * height;
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
