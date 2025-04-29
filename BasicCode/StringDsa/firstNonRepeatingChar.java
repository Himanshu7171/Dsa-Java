 package BasicCode.StringDsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingChar {
 public static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> countMap = new LinkedHashMap<>(); // maintains insertion order

        for (char ch : s.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '-'; // if no non-repeating character
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeatingChar(input);
        if (result != '-') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
