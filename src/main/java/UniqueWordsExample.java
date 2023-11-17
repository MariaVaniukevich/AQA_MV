import java.util.*;

public class UniqueWordsExample {
    public static void main(String[] args) {
        // Создадим массив с набором слов
        String[] words = {
                "tiger", "lion", "jaguar", "bull", "elephant",
                "elephant", "hippopotamus", "zebra", "monkey", "snake",
                "horse", "tiger", "snake", "tiger", "hare"
        };

        // Создадим список для хранения уникальных слов
        List<String> uniqueWords = new ArrayList<>();

        // Создадим мапы для подсчета вхождений слов
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Поиск уникальных слов и подсчет вхождений
        for (String word : words) {
            Integer count = wordCountMap.getOrDefault(word, 0);
            wordCountMap.put(word, count + 1);
        }

        // Поиск уникального слова
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWords.add(entry.getKey());
            }
        }

        // Вывод списка уникальных слов
        System.out.println("Список уникальных слов:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
//Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.