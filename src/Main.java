import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String input = "садок школа робота робота школа школа університет університет робота";
        String wordToRemove = "школа";

        // знаходження кількості однакових слів у рядку
        String[] words = input.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        System.out.println("Введені слова: " + input);
        // Виведення результатів задання a
        System.out.println("Задання a:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // видалення заданого слова з рядка
        String output = input.replace(wordToRemove, "");

        // Виведення результатів задання б)
        System.out.println("\nЗадання б:");
        System.out.println("Введені слова: " + input);
        System.out.println("Рядок після видалення слова " + wordToRemove + ": " + output);
    }
}
