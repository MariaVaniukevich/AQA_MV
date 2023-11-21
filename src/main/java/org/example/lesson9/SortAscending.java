package org.example.lesson9;

import java.util.Arrays;
import java.util.Comparator;

public class SortAscending {
    public static void main(String[] args) {
        String[] collection = {"f10", "f15", "f2", "f4", "f4"};

        // Сортировка строк по возрастанию числового значения
        String[] sortedArray = Arrays.stream(collection)
                .sorted(Comparator.comparingInt(SortAscending::extractNumberFromString))
                .toArray(String[]::new);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        Arrays.stream(sortedArray)
                .forEach(System.out::println);
    }

    // Метод для извлечения числового значения из строки
    private static int extractNumberFromString(String s) {
        String numberString = s.replaceAll("\\D", ""); // Удаление всех нецифровых символов
        return Integer.parseInt(numberString);
    }
}