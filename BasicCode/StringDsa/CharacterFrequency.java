package BasicCode.StringDsa;
import java.util.HashMap;
import java.util.Map;
public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "banana";

        // Convert to lowercase to handle case insensitivity (optional)
        str = str.toLowerCase();

        // Create a map to store frequencies
        Map<Character, Integer> freqMap = new HashMap<>();

        // Loop through characters
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) { // Only count letters/digits
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the frequency map
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
