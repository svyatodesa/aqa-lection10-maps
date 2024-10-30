import java.util.HashMap;
import java.util.Map;

public class StringLengthMap {
    public static Map<String, Integer> getLengthOfStrings(String[] strings) {
        Map<String, Integer> stringLengthMap = new HashMap<>();

        for (String str : strings) {
            // Додаємо унікальні рядки з їх довжиною
            stringLengthMap.put(str, str.length());
        }

        return stringLengthMap;
    }

    public static void main(String[] args) {
        String[] input1 = {"a", "bb", "a", "bb"};
        String[] input2 = {"this", "and", "that", "and"};
        String[] input3 = {"code", "code", "code", "bug"};

        System.out.println("Результат для input1: " + getLengthOfStrings(input1));
        System.out.println("Результат для input2: " + getLengthOfStrings(input2));
        System.out.println("Результат для input3: " + getLengthOfStrings(input3));
    }
}
