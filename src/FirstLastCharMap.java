import java.util.HashMap;
import java.util.Map;

public class FirstLastCharMap {
    public static Map<String, String> createMap(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();

        for (String str : strings) {
            if (!str.isEmpty()) {
                String firstChar = str.substring(0, 1); // Перший символ
                String lastChar = str.substring(str.length() - 1); // Останній символ
                resultMap.put(firstChar, lastChar); // Додаємо в мапу
            }
        }

        return resultMap;
    }

    public static void main(String[] args) {
        String[] input1 = {"code", "bug"};
        String[] input2 = {"man", "moon", "main"};
        String[] input3 = {"man", "moon", "good", "night"};

        System.out.println("Результат для input1: " + createMap(input1));
        System.out.println("Результат для input2: " + createMap(input2));
        System.out.println("Результат для input3: " + createMap(input3));
    }
}

