package org.example.lesson9;

import java.util.Arrays;
import java.util.List;

public class ManipulationCollection {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("Highload", "High", "Load", "Highload");

        // 2.1. Посчитать, сколько раз объект "High" встречается в коллекции
        long count = countOccurrences(collection, "High");
        System.out.println("Количество вхождений 'High': " + count);

        // 2.2. Определить, какой элемент в коллекции находится на первом месте
        String firstElement = getFirstElement(collection);
        System.out.println("Первый элемент: " + firstElement);

        // 2.3. Необходимо вернуть последний элемент
        String lastElement = getLastElement(collection);
        System.out.println("Последний элемент: " + lastElement);
    }

    // 2.1. Метод для подсчета количества вхождений заданного элемента в коллекции
    public static long countOccurrences(List<String> collection, String element) {
        return collection.stream()
                .filter(e -> e.equals(element))
                .count();
    }

    // 2.2. Метод для получения первого элемента коллекции
    public static String getFirstElement(List<String> collection) {
        return collection.stream()
                .findFirst()
                .orElse("0");
    }

    // 2.3. Метод для получения последнего элемента коллекции
    public static String getLastElement(List<String> collection) {
        return collection.stream()
                .reduce((first, second) -> second)
                .orElse("0");
    }
}