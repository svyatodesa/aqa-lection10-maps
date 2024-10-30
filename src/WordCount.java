import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            // Якщо слово вже є в мапі, збільшуємо його значення
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String[] input1 = {"a", "b", "a", "c", "b"};
        String[] input2 = {"c", "b", "a"};
        String[] input3 = {"c", "c", "c", "c"};

        System.out.println("Результат для input1: " + countWords(input1));
        System.out.println("Результат для input2: " + countWords(input2));
        System.out.println("Результат для input3: " + countWords(input3));
    }
}
