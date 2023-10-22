package org.example;

public class Lesson2 {
    public static void main(String[] args) {

        printThreeWords();
        compareNumbers();
        printColor();
        checkSumSign();
    }

    //  1  задача
    public static void printThreeWords() {
        System.out.println("Banana");
        System.out.println("Orange");
        System.out.println("Apple");
    }

    //  4  задача
    public static void compareNumbers() {
        int a = 0;
        int b = 0;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //  3 задача
    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 2 задача
    public static void checkSumSign() {
        int a = -102;
        int b = 67;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
