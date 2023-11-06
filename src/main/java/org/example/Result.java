package org.example;

public class Result {
    public static void main(String[] args) {

        Rectangle rectangleA = new Rectangle(4, 23, "желтый", "красный");
        System.out.println(rectangleA.area() + " - это площадь прямоугольника");
        System.out.println(rectangleA.perimeter() + " - это периметр прямоугольника");
        System.out.println(rectangleA.borderColor() + " - это цвет границ прямоугольника");
        System.out.println(rectangleA.fillColor() + " - это цвет заливки прямоугольника");

        Shape shape1 = new Circle(9.88, "зеленый", "голубой");
        System.out.println(shape1.area() + " - это площадь круга");
        System.out.println(shape1.perimeter() + " - это периметр круга");
        System.out.println(shape1.borderColor() + " - это цвет границ круга");
        System.out.println(shape1.fillColor() + " - это цвет заливки круга");

        Triangle triangle1 = new Triangle(5, 7, 6, 4.90,
                "салатовый", "белый");
        System.out.println(triangle1.area() + " - это площадь треугольника");
        System.out.println(triangle1.perimeter() + " - это периметр треугольника");
        System.out.println(triangle1.borderColor() + " - это цвет границ треугольника");
        System.out.println(triangle1.fillColor() + " - это цвет заливки треугольника");

    }
}
