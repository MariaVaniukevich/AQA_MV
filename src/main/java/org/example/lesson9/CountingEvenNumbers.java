package org.example.lesson9;

import java.util.Arrays;

public class CountingEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {9, 78, 3, 1289, 66, 8, 2, 43, 44, 6};
        long count = countEvenNumbers(numbers);

        System.out.println("Набор случайно-сгенерированных чисел:");
        printNumbers(numbers);

        System.out.println("Количество чётных чисел равно: " + count);
    }

    // Метод для подсчета количества чётных чисел с использованием Stream API
    public static long countEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .count();
    }

    // Метод для вывода чисел в консоль
    public static void printNumbers(int[] numbers) {
        Arrays.stream(numbers)
                .forEach(number -> System.out.print(number + " "));
        System.out.println();
    }
}