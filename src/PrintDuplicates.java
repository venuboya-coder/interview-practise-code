import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {
    static void main() {
        printDuplicatesFunction(null);
        printDuplicatesFunction("");
        printDuplicatesFunction("A");
        printDuplicatesFunction("java");

    }

    public static void printDuplicatesFunction(String str) {
        if (str == null) {
            System.out.println("NULL value");
            return;
        }

        if (str.length() == 1) {
            System.out.println("Single character");
            return;
        }

        if (str.isEmpty()) {
            System.out.println("Empty String");
            return;
        }

        char[] words = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (Character ch : words) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else  {
                charMap.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
